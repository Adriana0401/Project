package RestController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Utente;
import com.example.demo.Model.Dao.UtenteDao;

@RestController
@RequestMapping(value="api/rest/utenti")
public class UtenteRestController {
	
	@Autowired
	UtenteDao ud;
	
	@GetMapping(value="/{id}",produces = "application/json")
	public Utente getUtenteRestById(@PathVariable int id) {
		return ud.readByKey(id);
	}
	
	@GetMapping (produces ="application/json")
	public ArrayList<Utente> getUtenti() {
		return ud.readAll();
		
	}

}
