package ifal.edu.pw2.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Editora {

	@Id
	@GeneratedValue
	private Integer idEditora;
	@Column
	private String tefefone;
	@Column
	private String nome;

	public Editora(Integer idEditora, String tefefone, String nome) {
		super();
		this.idEditora = idEditora;
		this.tefefone = tefefone;
		this.nome = nome;
	}

	public Editora() {

	}

	public Integer getCodigo() {
		return idEditora;
	}

	public void setCodigo(Integer codigo) {
		this.idEditora = codigo;
	}

	public String getTefefone() {
		return tefefone;
	}

	public void setTefefone(String tefefone) {
		this.tefefone = tefefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
