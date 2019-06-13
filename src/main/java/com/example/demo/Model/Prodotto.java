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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//ciao
@Entity
@Table(name = "Prodotti")
public class Prodotto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProdotto;

	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "foto")
	private String foto;

	@Column(name = "nome")
	private String nome;
	


	@ManyToOne
	@JoinColumn(name = "id_categoria", referencedColumnName = "idCategoria ", insertable = false, updatable = false)
	private Categoria categoria;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "prodotto")
	private Set<ProdottoListino> prodottolistino = new HashSet<ProdottoListino>();

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER, mappedBy = "prodotto", orphanRemoval = true)
	private Set<Carrello> carrello = new HashSet<Carrello>();

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<ProdottoListino> getProdottolistino() {
		return prodottolistino;
	}

	public void setProdottolistino(Set<ProdottoListino> prodottolistino) {
		this.prodottolistino = prodottolistino;
	}

	public Set<Carrello> getCarrello() {
		return carrello;
	}

	public void setCarrello(Set<Carrello> carrello) {
		this.carrello = carrello;
	}


	public Prodotto(int idProdotto, String descrizione, String foto, String nome, Categoria categoria,
			Set<ProdottoListino> prodottolistino, Set<Carrello> carrello,boolean acquistato) {
		super();
		this.idProdotto = idProdotto;
		this.descrizione = descrizione;
		this.foto = foto;
		this.nome = nome;
		this.categoria = categoria;
		this.prodottolistino = prodottolistino;
		this.carrello = carrello;
	
	}


	public Prodotto() {
		super();
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((carrello == null) ? 0 : carrello.hashCode());
//		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
//		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
//		result = prime * result + ((foto == null) ? 0 : foto.hashCode());
//		result = prime * result + idProdotto;
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		result = prime * result + ((prodottolistino == null) ? 0 : prodottolistino.hashCode());
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
		Prodotto other = (Prodotto) obj;
		if (carrello == null) {
			if (other.carrello != null)
				return false;
		} else if (!carrello.equals(other.carrello))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (foto == null) {
			if (other.foto != null)
				return false;
		} else if (!foto.equals(other.foto))
			return false;
		if (idProdotto != other.idProdotto)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prodottolistino == null) {
			if (other.prodottolistino != null)
				return false;
		} else if (!prodottolistino.equals(other.prodottolistino))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Prodotto [idProdotto=" + idProdotto + ", descrizione=" + descrizione + ", foto=" + foto + ", nome="
				+ nome + ", categoria=" + categoria + ", prodottolistino="
				+ prodottolistino + ", carrello=" + carrello + "]";
	}



}
