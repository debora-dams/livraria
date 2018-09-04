package ifal.edu.pw2.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifal.edu.pw2.demo.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {

}
