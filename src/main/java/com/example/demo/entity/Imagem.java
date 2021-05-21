package com.example.demo.entity;

public class Imagem {
	private int id_img;
	private String url; 
	private Anuncio anuncio;
	public Imagem(int id_img, String url, Anuncio anuncio) {
		super();
		this.id_img = id_img;
		this.url = url;
		this.anuncio = anuncio;
	}
	public int getId_img() {
		return id_img;
	}
	public void setId_img(int id_img) {
		this.id_img = id_img;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Anuncio getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}
	
	
	
}
