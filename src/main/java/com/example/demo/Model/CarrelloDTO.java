package com.example.demo.Model;

import java.io.Serializable;

public class CarrelloDTO implements Serializable {

	private String foto;
	private String nome;
	private String descrizione;
	private int id_prodotto;
	private int id_utente;
	private int quantita;
	private int prezzo;
	private int moltiplicazione;
	private boolean acquistato;

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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

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

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getMoltiplicazione() {
		return moltiplicazione;
	}

	public void setMoltiplicazione(int moltiplicazione) {
		this.moltiplicazione = moltiplicazione;
	}

	
	
	public boolean isAcquistato() {
		return acquistato;
	}

	public void setAcquistato(boolean acquistato) {
		this.acquistato = acquistato;
	}

	public CarrelloDTO(String foto, String nome, String descrizione, int id_prodotto, int id_utente, int quantita,
			int prezzo, int moltiplicazione,boolean acquistato) {
		super();
		this.foto = foto;
		this.nome = nome;
		this.descrizione = descrizione;
		this.id_prodotto = id_prodotto;
		this.id_utente = id_utente;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.moltiplicazione = moltiplicazione;
		this.acquistato = acquistato;
	}

	public CarrelloDTO() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((foto == null) ? 0 : foto.hashCode());
		result = prime * result + id_prodotto;
		result = prime * result + id_utente;
		result = prime * result + moltiplicazione;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + prezzo;
		result = prime * result + quantita;
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
		CarrelloDTO other = (CarrelloDTO) obj;
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
		if (id_prodotto != other.id_prodotto)
			return false;
		if (id_utente != other.id_utente)
			return false;
		if (moltiplicazione != other.moltiplicazione)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prezzo != other.prezzo)
			return false;
		if (quantita != other.quantita)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarrelloDTO [foto=" + foto + ", nome=" + nome + ", descrizione=" + descrizione + ", id_prodotto="
				+ id_prodotto + ", id_utente=" + id_utente + ", quantita=" + quantita + ", prezzo=" + prezzo
				+ ", moltiplicazione=" + moltiplicazione + "]";
	}

}
