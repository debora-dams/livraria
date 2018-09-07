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

import ifal.edu.pw2.demo.model.Livro;
import ifal.edu.pw2.demo.repositories.LivroRepository;

//Resource 

@RestController
@RequestMapping("/livro")
public class LivroResource {

	@Autowired
	LivroRepository livroRepository;

	@GetMapping
	public List<Livro> get() {
		return livroRepository.findAll();
	}

	@GetMapping("{id}")
	public Livro get(@PathVariable("id") Integer id) {
		return livroRepository.getOne(id);
	}

	@PostMapping
	public Livro save(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}

	@PutMapping
	public Livro update(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		livroRepository.deleteById(id);
	}
}
