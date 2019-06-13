package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerPage {

	@RequestMapping(value = "/home", method = RequestMethod.GET) // PAGINA HOME
	public String home(HttpServletRequest request, ModelMap map) {
		return "Index";
	}

	@RequestMapping(value = "/artista", method = RequestMethod.GET) // PAGINA ARTISTA
	public String artista(HttpServletRequest request, ModelMap map) {
		return "Artista";
	}

	@RequestMapping(value = "/news", method = RequestMethod.GET) // PAGINA NEWS
	public String news(HttpServletRequest request, ModelMap map) {
		return "News";
	}

	@RequestMapping(value = "/accesso-negato", method = RequestMethod.GET) // PAGINA NEWS
	public String accessoNegato(HttpServletRequest request, ModelMap map) {
		return "AccessoNegato";
	}

}
