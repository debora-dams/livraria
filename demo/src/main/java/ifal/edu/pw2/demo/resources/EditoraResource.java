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

import ifal.edu.pw2.demo.model.Editora;
import ifal.edu.pw2.demo.repositories.EditoraRepository;

@RestController
@RequestMapping("/editora")
public class EditoraResource {
	
	@Autowired
	EditoraRepository editoraRepository;
	
	@GetMapping
	public List<Editora> get(){
		return editoraRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Editora get(@PathVariable("id") Integer id) {
		return editoraRepository.getOne(id);
	}
	
	@PostMapping
	public Editora save(@RequestBody Editora editora) {
		return editoraRepository.save(editora);
	}
	
	@PutMapping
	public Editora update(@RequestBody Editora editora) {
		return editoraRepository.save(editora);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		editoraRepository.deleteById(id);
	}

}
