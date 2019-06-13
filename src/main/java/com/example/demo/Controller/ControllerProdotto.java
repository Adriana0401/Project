package com.example.demo.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.ProdottoDTO;
import com.example.demo.Model.Dao.ImpaginazioneDao;
import com.example.demo.Model.Dao.ProdottoDao;

@Controller
public class ControllerProdotto {

	@Autowired
	ProdottoDao pd;

	@Autowired
	ImpaginazioneDao id;

	@RequestMapping(value = "/prodotti", method = RequestMethod.GET)
	public String prodotti(HttpServletRequest request, ModelMap map) {
		int paginaAttuale = 1;
		HttpSession session = request.getSession();
		session.setAttribute("paginaAttuale", paginaAttuale);

		ArrayList<ProdottoDTO> prodottodto = id.leggiPagina();
		session.setAttribute("prodottodto", prodottodto);

//		ArrayList<ProdottoDTO>prodottodto =pd.prodottodto();
//		HttpSession session = request.getSession();
//		session.setAttribute("prodottodto", prodottodto);
		return "Prodotti";
	}

}
