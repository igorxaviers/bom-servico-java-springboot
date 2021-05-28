package com.example.demo.entity;

import java.math.BigDecimal;

public class Anuncio {
	private int id_anu;
	private String titulo; 
	private Categoria categoria;
	private String descricao;
	private Double preco; 
	private String contato; 
	private Localidade localidade; 
	private Usuario usuario;
	
	public Anuncio(int id_anu, String titulo, String descricao, Double preco, String contato, Localidade localidade,  Categoria categoria, Usuario usuario) {
		this.id_anu = id_anu;
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.contato = contato;
		this.localidade = localidade;
		this.categoria = categoria;
		this.usuario = usuario;
	}

	public int getId() {
		return id_anu;
	}

	public void setTitulo(int id) {
		this.id_anu = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
