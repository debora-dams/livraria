package ifal.edu.pw2.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifal.edu.pw2.demo.model.Autor;
import ifal.edu.pw2.demo.repositories.AutorRepository;

@RestController
@RequestMapping("/autor")
public class AutorResource {

	@Autowired
	AutorRepository autorRepository;

	@GetMapping
	public List<Autor> get() {
		return autorRepository.findAll();
	}

	@GetMapping("{id}")
	public Autor get(@PathVariable("id") Integer id) {
		return autorRepository.getOne(id);
	}

	@PostMapping
	public Autor save(@RequestBody Autor autor) {
		return autorRepository.save(autor);
	}

	@PutMapping
	public Autor update(@RequestBody Autor autor) {
		return autorRepository.save(autor);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		autorRepository.deleteById(id);
	}

}
