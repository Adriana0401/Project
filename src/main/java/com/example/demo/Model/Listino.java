package com.example.demo.Model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Listini")
public class Listino implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idListino;

	@Column(name = "data")
	private Date data;

	@Column(name = "nome")
	private String nome;

	@Column(name = "attivo")
	private boolean attivo;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "listino")
	private Set<ProdottoListino> prodottolistino = new HashSet<ProdottoListino>();

	public int getIdListino() {
		return idListino;
	}

	public void setIdListino(int idListino) {
		this.idListino = idListino;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	public Set<ProdottoListino> getProdottolistino() {
		return prodottolistino;
	}

	public void setProdottolistino(Set<ProdottoListino> prodottolistino) {
		this.prodottolistino = prodottolistino;
	}

	public Listino(int idListino, Date data, String nome, boolean attivo, Set<ProdottoListino> prodottolistino) {
		super();
		this.idListino = idListino;
		this.data = data;
		this.nome = nome;
		this.attivo = attivo;
		this.prodottolistino = prodottolistino;
	}

	public Listino() {
		super();
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (attivo ? 1231 : 1237);
//		result = prime * result + ((data == null) ? 0 : data.hashCode());
//		result = prime * result + idListino;
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
		Listino other = (Listino) obj;
		if (attivo != other.attivo)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (idListino != other.idListino)
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
		return "Listino [idListino=" + idListino + ", data=" + data + ", nome=" + nome + ", attivo=" + attivo
				+ ", prodottolistino=" + prodottolistino + "]";
	}

}
