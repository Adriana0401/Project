package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProdottiListini")
public class ProdottoListino {

	@Embeddable
	public static class Id implements Serializable {
		private static final long serialVersionUID = 1L;

		@Column(name = "id_listino")
		private int id_listino;

		@Column(name = "id_prodotto")
		private int id_prodotto;

		public int getId_listino() {
			return id_listino;
		}

		public void setId_listino(int id_listino) {
			this.id_listino = id_listino;
		}

		public int getId_prodotto() {
			return id_prodotto;
		}

		public void setId_prodotto(int id_prodotto) {
			this.id_prodotto = id_prodotto;
		}

		public Id(int id_listino, int id_prodotto) {
			super();
			this.id_listino = id_listino;
			this.id_prodotto = id_prodotto;
		}

		public Id() {
			super();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id_listino;
			result = prime * result + id_prodotto;
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
			Id other = (Id) obj;
			if (id_listino != other.id_listino)
				return false;
			if (id_prodotto != other.id_prodotto)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Id [id_listino=" + id_listino + ", id_prodotto=" + id_prodotto + "]";
		}

	}

	@EmbeddedId
	private Id id;

	@ManyToOne
	@JoinColumn(name = "id_listino", referencedColumnName = "idListino", insertable = false, updatable = false)
	private Listino listino;

	@ManyToOne
	@JoinColumn(name = "id_prodotto", referencedColumnName = "idProdotto", insertable = false, updatable = false)
	private Prodotto prodotto;

	@Column(name = "prezzo")
	private int prezzo;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Listino getListino() {
		return listino;
	}

	public void setListino(Listino listino) {
		this.listino = listino;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public ProdottoListino(Id id, Listino listino, Prodotto prodotto, int prezzo) {
		super();
		this.id = id;
		this.listino = listino;
		this.prodotto = prodotto;
		this.prezzo = prezzo;
	}

	public ProdottoListino() {
		super();
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((listino == null) ? 0 : listino.hashCode());
//		result = prime * result + prezzo;
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
		ProdottoListino other = (ProdottoListino) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listino == null) {
			if (other.listino != null)
				return false;
		} else if (!listino.equals(other.listino))
			return false;
		if (prezzo != other.prezzo)
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
		return "ProdottoListino [id=" + id + ", listino=" + listino + ", prodotto=" + prodotto + ", prezzo=" + prezzo
				+ "]";
	}

}
