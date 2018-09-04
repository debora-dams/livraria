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

import ifal.edu.pw2.demo.model.Pessoa;
import ifal.edu.pw2.demo.repositories.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping
	public List<Pessoa> get(){
		return pessoaRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Pessoa get(@PathVariable("id") Integer id) {
		return pessoaRepository.getOne(id);
	}
	
	@PostMapping
	public Pessoa save(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@PutMapping
	public Pessoa update(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		pessoaRepository.deleteById(id);
	}
}
