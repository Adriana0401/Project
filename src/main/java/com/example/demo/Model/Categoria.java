package com.example.demo.Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categorie")
public class Categoria implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;

	@Column(name = "categoria")
	private String categoria;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "categoria")
	private Set<Prodotto> prodotto = new HashSet<Prodotto>();

	public int getId() {
		return idCategoria;
	}

	public void setId(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Set<Prodotto> getProdotto() {
		return prodotto;
	}

	public void setProdotto(Set<Prodotto> prodotto) {
		this.prodotto = prodotto;
	}

	public Categoria(int idCategoria, String categoria, Set<Prodotto> prodotto) {
		super();
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.prodotto = prodotto;
	}

	public Categoria() {
		super();
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
//		result = prime * result + idCategoria ;
//		result = prime * result + ((prodotto == null) ? 0 : prodotto.hashCode());
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (idCategoria != other.idCategoria)
			return false;
		if (prodotto == null) {
			if (other.prodotto != null)
				return false;
		} else if (!prodotto.equals(other.prodotto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + "]";
	}

}
