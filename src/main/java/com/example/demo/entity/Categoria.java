package com.example.demo.entity;

public class Categoria {
	private int id_cat;
	private String label;
	
	public Categoria(int id_cat, String label) {
		super();
		this.id_cat = id_cat;
		this.label = label;
	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
}
