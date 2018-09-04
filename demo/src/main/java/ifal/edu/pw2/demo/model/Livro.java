package ifal.edu.pw2.demo.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(unique = true)
	private String isbn;
	// Marca do atributo composto
	@Embedded
	private Autor autor;
	@Column
	private String descricao;
	@Column
	private String estoqueDeLivros;

	public Livro() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstoqueDeLivros() {
		return estoqueDeLivros;
	}

	public void setEstoqueDeLivros(String estoqueDeLivros) {
		this.estoqueDeLivros = estoqueDeLivros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((estoqueDeLivros == null) ? 0 : estoqueDeLivros.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (estoqueDeLivros == null) {
			if (other.estoqueDeLivros != null)
				return false;
		} else if (!estoqueDeLivros.equals(other.estoqueDeLivros))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
