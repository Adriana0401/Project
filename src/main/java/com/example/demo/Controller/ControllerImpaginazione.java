package com.example.demo.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.ProdottoDTO;
import com.example.demo.Model.Dao.ImpaginazioneDao;
import com.example.demo.Model.Dao.ProdottoDao;

@Controller
public class ControllerImpaginazione {

	@Autowired
	ProdottoDao pd;

	@Autowired
	ImpaginazioneDao id;

	@RequestMapping(value = "/impaginazione", method = RequestMethod.GET)
	public String impaginazione(HttpServletRequest request, ModelMap map) {
		String sceltaPagina = (request.getParameter("Pagina"));
		ArrayList<ProdottoDTO> prodottodto = null;

		switch (sceltaPagina) {

		case "<<":

			id.primaPag();
			prodottodto = id.leggiPagina();

			break;

		case "<":
			id.pagPrec();
			prodottodto = id.leggiPagina();
			break;

		case ">":
			id.pagSucc();
			prodottodto = id.leggiPagina();
			break;

		case ">>":
			id.ultimaPag();
			prodottodto = id.leggiPagina();
			break;
		}
		map.addAttribute("prodottodto", prodottodto);
		System.out.println(prodottodto);

		return "Prodotti";

	}

}
