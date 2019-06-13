package RestController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Categoria;
import com.example.demo.Model.Dao.CategoriaDao;

public class CategoriaRestController {

	@Autowired
	CategoriaDao cd;
	
	@GetMapping(value="/{id}",produces = "application/json")
	public Categoria getCategoriaRestById(@PathVariable int id) {
		return cd.readByKey(id);


}
	@GetMapping (produces ="application/json")
	public ArrayList<Categoria> getCategoria() {
		return cd.readAll();
}
}
