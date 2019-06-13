package RestController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Prodotto;
import com.example.demo.Model.Dao.ProdottoDao;

@RestController
@RequestMapping(value="api/rest/prodotti")
public class ProdottoRestController {
	
	@Autowired
	ProdottoDao pd;
	
	@GetMapping(value="/{id}",produces = "application/json")
	public Prodotto getProdottoRestById(@PathVariable int id) {
		return pd.readByKey(id);


}
	@GetMapping (produces ="application/json")
	public ArrayList<Prodotto> getProdotti() {
		return pd.readAll();
}
	@PostMapping(value="/{prodotto}",produces = "application/json")
	public boolean createProdottoRest (@PathVariable Prodotto prodotto) {
		return pd.inserimento(prodotto);
	}
	
	@DeleteMapping(value="/{prodotto}",produces = "application/json")
	public boolean deleteProdottoRest(@PathVariable Prodotto prodotto) {
		return pd.elimina(prodotto);
	}
	
	
}