package com.example.demo.entity;

public class Anuncio {
	private String titulo; 
	private Categoria categoria;
	private String descricao;
	private double preco; 
	private String contato; 
	private Localidade localidade; 
	private Usuario usuario;
	
	public Anuncio(String titulo, Categoria categoria, String descricao, double preco, String contato,
                   Localidade localidade, Usuario usuario) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.descricao = descricao;
		this.preco = preco;
		this.contato = contato;
		this.localidade = localidade;
		this.usuario = usuario;
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
