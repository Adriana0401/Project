package com.example.demo.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.Carrello;
import com.example.demo.Model.Carrello.Id;
import com.example.demo.Model.CarrelloDTO;
import com.example.demo.Model.Prodotto;
import com.example.demo.Model.Utente;
import com.example.demo.Model.Dao.CarrelloDao;
import com.example.demo.Model.Dao.ProdottoDao;
import com.example.demo.Model.Dao.UtenteDao;

@Controller
public class ControllerCarrello {

	@Autowired
	CarrelloDao carrellodao;

	@Autowired
	UtenteDao utentedao;

	@Autowired
	ProdottoDao prodottodao;

	@RequestMapping(value = "/acquista", method = RequestMethod.GET)
	public String carrello(HttpServletRequest request, ModelMap map) {

		Carrello carrello = new Carrello();
		HttpSession session = request.getSession();
		Utente u = (Utente) session.getAttribute("utente");

		if (u == null) {
			Utente utente = new Utente();
			map.addAttribute(utente);
			return "Login";
		} else {

			Utente utente = utentedao.readByUser(u.getEmail());
			int idutente = utente.getIdUtente();
			int idprodotto = Integer.parseInt(request.getParameter("idProdotto"));

			Carrello carrellonew = carrellodao.readCarrello(idutente, idprodotto);
			if (carrellonew != null) {
				int quantita = carrellodao.quantita(idutente, idprodotto);
				quantita++;
				carrellonew.setQuantita(quantita);
				carrellonew.setAcquistato(false);
				carrellodao.modifica(carrellonew);
			} else {

				carrello.setId(new Id(idprodotto, idutente));
				carrello.setQuantita(1);
				carrellodao.inserimento(carrello);
			}

			return "redirect:/carrelloacquisti";

		}
	}

	int totale = 0;

	@RequestMapping(value = "/carrelloacquisti", method = RequestMethod.GET)
	public String newcarrello(HttpServletRequest request, ModelMap map) {

		HttpSession session = request.getSession();
		Utente u = (Utente) session.getAttribute("utente");
		if (u == null) {
			Utente utente = new Utente();
			map.addAttribute(utente);
			return "Login";
		} else {
			int idutente = u.getIdUtente();
			ArrayList<CarrelloDTO> listcarrello = carrellodao.carrello(idutente);
			totale = 0;
			listcarrello.forEach(prodotto -> {
				totale = totale + (prodotto.getQuantita() * prodotto.getPrezzo());
			});
			int spedizione = 5;
			spedizione += totale;
			Carrello.Id id = new Id();
			
			ArrayList<String> conta = new ArrayList<>();
			for(CarrelloDTO cd :listcarrello) {
			boolean acquistato = cd.isAcquistato();
			if(acquistato==false) {
				conta.add("falso");
			}
			}
			session.setAttribute("conta", conta);
			map.addAttribute("id", id);
			request.setAttribute("spedizione", spedizione);
			request.setAttribute("totale", totale);
			session.setAttribute("listcarrello", listcarrello);

			return "Carrello";

		}

	}

	@RequestMapping(value = "/eliminazione", method = RequestMethod.POST)
	public String eliminazione(HttpServletRequest request, ModelMap map, @Valid Id id) {

//		HttpSession session = request.getSession();
//		Utente u = (Utente) session.getAttribute("utente");
//		int idutente = u.getIdUtente();
//		int idprodotto=Integer.parseInt(request.getParameter("idProdotto"));
		Carrello carrellonew = carrellodao.readCarrello(id.getId_utente(), id.getId_prodotto());
		int quantita = carrellonew.getQuantita();
		if (quantita > 1) {
			quantita--;
			carrellonew.setQuantita(quantita);
			carrellodao.modifica(carrellonew);
		} else {
			carrellonew.setId(id);
			carrellodao.elimina(carrellonew);
		}
		return "redirect:/carrelloacquisti";
	}
	@RequestMapping(value = "/ordineConfermato", method = RequestMethod.GET)
	public String ordineConfermato(HttpServletRequest request, ModelMap map) {
		
		HttpSession session = request.getSession();
		ArrayList<CarrelloDTO> listcarrello =(ArrayList<CarrelloDTO>) session.getAttribute("listcarrello");
		for(CarrelloDTO carrellodto:listcarrello) {
			int idprodotto = carrellodto.getId_prodotto();
			Utente utente = (Utente)session.getAttribute("utente");
			int idutente = utente.getIdUtente();
			Carrello c = carrellodao.readCarrello(idutente,idprodotto);
			c.setAcquistato(true);
			carrellodao.modifica(c);
		}
		return "redirect:/carrelloacquisti";
		
	}

	
}
