package com.example.demo.Model;

import java.io.Serializable;


public class ProdottoDTO implements Serializable {

	private int idProdotto;
	private String descrizione;
	private String foto;
	private String nome;
	private Categoria categoria;
	private int prezzo;

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

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public ProdottoDTO(int idProdotto, String descrizione, String foto, String nome, Categoria categoria, int prezzo) {
		super();
		this.idProdotto = idProdotto;
		this.descrizione = descrizione;
		this.foto = foto;
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	public ProdottoDTO() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((foto == null) ? 0 : foto.hashCode());
		result = prime * result + idProdotto;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + prezzo;
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
		ProdottoDTO other = (ProdottoDTO) obj;
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
		if (prezzo != other.prezzo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProdottoDTO [idProdotto=" + idProdotto + ", descrizione=" + descrizione + ", foto=" + foto + ", nome="
				+ nome + ", categoria=" + categoria + ", prezzo=" + prezzo + "]";
	}

}
