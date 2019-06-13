package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.Ruolo;
import com.example.demo.Model.Utente;
import com.example.demo.Model.Dao.RuoloDao;
import com.example.demo.Model.Dao.UtenteDao;

@Controller
public class ControllerUtente {

	@Autowired
	UtenteDao ud;

	@Autowired
	RuoloDao ruolodao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String benvenuto(HttpServletRequest request, ModelMap map) {
		return "Index";
	}

	@RequestMapping(value = "/registrazione", method = RequestMethod.GET) // PAGINA REGITRAZIONE
	public String registrazione(HttpServletRequest request, ModelMap map) {
		Utente utente = new Utente();
		map.addAttribute(utente);
		return "Registrazione";
	}

	@RequestMapping(value = "/regNuovoUtente", method = RequestMethod.POST)
	public String registrazioneUtente(HttpServletRequest request, @Valid Utente utente, BindingResult bindingResult) {

		Utente utentePresente = ud.utentePresente(utente);
		if (utentePresente != null) {
			bindingResult.rejectValue("email", "error.utente", "Email già utilizzata");
		}
		if (bindingResult.hasErrors()) {
			return "Registrazione";

		} else {
			Ruolo ruolo = ruolodao.readByRole("USER");
			utente.setRuolo(ruolo);
			ud.inserimento(utente);

			HttpSession session = request.getSession();
			session.setAttribute("utente", utente);
			return "Index";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, ModelMap map) {
		Utente utente = new Utente();
		map.addAttribute(utente);

		return "Login";
	}

	@RequestMapping(value = "/default")
	public String loginUtente(HttpServletRequest request) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		Utente utentenew = ud.readByUser(auth.getName());

		HttpSession session = request.getSession();
		session.setAttribute("utente", utentenew);

		if (auth.getAuthorities().contains(new SimpleGrantedAuthority("God"))) {
			return "god/Index";

		} else if (auth.getAuthorities().contains(new SimpleGrantedAuthority("Amministratore"))) {
			return "admin/Index";

		} else {
			return "Index";

		}

	}

	@RequestMapping(value = "/failure", method = RequestMethod.GET)
	public String failure(@Valid Utente utente, BindingResult bindingResult, HttpServletRequest request, ModelMap map) {

		return "Login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET) // PAGINA DI LOGIN
	public String logout(HttpServletRequest request, ModelMap map) {
		HttpSession session = request.getSession();
		if (session.getAttribute("utente") != null) {
			session.removeAttribute("utente");
		}
		return "Index";

	}

}
