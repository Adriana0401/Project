package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.Model.ProdottoListino.Id;

@Entity
@Table(name = "carrello")
public class Carrello {

	@Embeddable
	public static class Id implements Serializable {
		private static final long serialVersionUID = 1L;

		@Column(name = "id_prodotto")
		private int id_prodotto;

		@Column(name = "id_utente")
		private int id_utente;

		public int getId_prodotto() {
			return id_prodotto;
		}

		public void setId_prodotto(int id_prodotto) {
			this.id_prodotto = id_prodotto;
		}

		public int getId_utente() {
			return id_utente;
		}

		public void setId_utente(int id_utente) {
			this.id_utente = id_utente;
		}

		public Id(int id_prodotto, int id_utente) {
			super();
			this.id_prodotto = id_prodotto;
			this.id_utente = id_utente;
		}

		public Id() {
			super();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id_prodotto;
			result = prime * result + id_utente;
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
			if (id_prodotto != other.id_prodotto)
				return false;
			if (id_utente != other.id_utente)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Id [id_prodotto=" + id_prodotto + ", id_utente=" + id_utente + "]";
		}

	}

	@EmbeddedId
	private Id id;

	@ManyToOne
	@JoinColumn(name = "id_utente", referencedColumnName = "idUtente", insertable = false, updatable = false)
	private Utente utente;

	@ManyToOne
	@JoinColumn(name = "id_prodotto", referencedColumnName = "idProdotto", insertable = false, updatable = false)
	private Prodotto prodotto;

	@Column(name = "quantita")
	private int quantita;
	
	@Column(name = "acquistato")
	private boolean acquistato;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	

	public boolean isAcquistato() {
		return acquistato;
	}

	public void setAcquistato(boolean acquistato) {
		this.acquistato = acquistato;
	}

	public Carrello(Id id, Utente utente, Prodotto prodotto, int quantita,boolean acquistato) {
		super();
		this.id = id;
		this.utente = utente;
		this.prodotto = prodotto;
		this.quantita = quantita;
		this.acquistato=acquistato;
	}

	public Carrello() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((prodotto == null) ? 0 : prodotto.hashCode());
		result = prime * result + quantita;
		result = prime * result + ((utente == null) ? 0 : utente.hashCode());
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
		Carrello other = (Carrello) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (prodotto == null) {
			if (other.prodotto != null)
				return false;
		} else if (!prodotto.equals(other.prodotto))
			return false;
		if (quantita != other.quantita)
			return false;
		if (utente == null) {
			if (other.utente != null)
				return false;
		} else if (!utente.equals(other.utente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carrello [id=" + id + ", quantita=" + quantita + "]";
	}

}
