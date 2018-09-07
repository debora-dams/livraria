package ifal.edu.pw2.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Integer idLivro;

	@Column
	private String nome;

	@Column(unique = true)
	private String isbn;

	@OneToOne
	@JoinColumn(name = "idAutor")
	private Autor autorLivro;

	@Column
	private double valor;

	@Column
	private double estoqueDeLivros;

	public Livro() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(Autor autorLivro) {
		this.autorLivro = autorLivro;
	}

	public double getEstoqueDeLivros() {
		return estoqueDeLivros;
	}

	public void setEstoqueDeLivros(double estoqueDeLivros) {
		this.estoqueDeLivros = estoqueDeLivros;
	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autorLivro == null) ? 0 : autorLivro.hashCode());
		long temp;
		temp = Double.doubleToLongBits(estoqueDeLivros);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((idLivro == null) ? 0 : idLivro.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (autorLivro == null) {
			if (other.autorLivro != null)
				return false;
		} else if (!autorLivro.equals(other.autorLivro))
			return false;
		if (Double.doubleToLongBits(estoqueDeLivros) != Double.doubleToLongBits(other.estoqueDeLivros))
			return false;
		if (idLivro == null) {
			if (other.idLivro != null)
				return false;
		} else if (!idLivro.equals(other.idLivro))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}

}
