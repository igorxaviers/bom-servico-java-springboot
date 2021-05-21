package com.example.demo.entity;

public class Localidade {
	private int id_localidade;
	private String cidade;
	private String estado;
	
	
	public Localidade(int id_localidade, String cidade, String estado) {
		super();
		this.id_localidade = id_localidade;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getId_localidade() {
		return id_localidade;
	}
	
	public void setId_localidade(int id_localidade) {
		this.id_localidade = id_localidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
