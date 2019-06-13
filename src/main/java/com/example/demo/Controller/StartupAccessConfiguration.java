package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Model.Ruolo;
import com.example.demo.Model.Utente;
import com.example.demo.Model.Dao.RuoloDao;
import com.example.demo.Model.Dao.UtenteDao;

@Component
public class StartupAccessConfiguration {

	boolean inizializzazioneAvvenuta = false;

	@Autowired
	UtenteDao utentedao;
	@Autowired
	RuoloDao ruolodao;

	@EventListener(ContextRefreshedEvent.class)
	@Transactional
	public void contextRefreshedEvent() {

		if (inizializzazioneAvvenuta)
			return;

		Utente utentegod = utentedao.readByUser("god@god.com");
		if (utentegod == null) {
			utentegod = new Utente();
			utentegod.setRuolo(createRoleIfNotFound("GOD"));
			utentegod.setEmail("god@god.com");
			utentegod.setPassword("godgod");
			utentegod.setNome("god");
			utentegod.setCognome("god");
			utentedao.inserimento(utentegod);
		}

		Utente utenteadmin = utentedao.readByUser("admin@admin.com");
		if (utenteadmin == null) {
			utenteadmin = new Utente();

			utenteadmin.setRuolo(createRoleIfNotFound("ADMIN"));
			utenteadmin.setEmail("admin@admin.com");
			utenteadmin.setPassword("adminadmin");
			utenteadmin.setNome("admin");
			utenteadmin.setCognome("admin");
			utentedao.inserimento(utenteadmin);

		}

		createRoleIfNotFound("USER");

		inizializzazioneAvvenuta = true;
	}

	private Ruolo createRoleIfNotFound(String ruolo) {

		Ruolo newruolo = ruolodao.readByRole(ruolo);
		if (newruolo == null) {

			newruolo = new Ruolo();
			newruolo.setRuolo(ruolo);
			ruolodao.inserimento(newruolo);

		}
		return newruolo;

	}
}
