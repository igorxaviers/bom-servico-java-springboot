package com.example.demo.entity;

public class Usuario {
	private int idUsu;
	private String email;
	private String senha;
	private String token;
	private int permissao;
	private String sobrenome;
	private String nome;

	public Usuario(){}

	public Usuario(int idUsu){
		this.idUsu = idUsu;
	}
	public Usuario(int idUsu, String email, String senha, String token,  int permissao, String nome, String sobrenome) {
		this.idUsu = idUsu;
		this.email = email;
		this.senha = senha;
		this.token = token;
		this.permissao = permissao;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Usuario(String email, String senha, String token, int permissao, String nome, String sobrenome) {
		this(0);
		this.email = email;
		this.senha = senha;
		this.token = token;
		this.permissao = permissao;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Usuario(Usuario u){
		this.idUsu = u.getIdUsu();
		this.email = u.getEmail();
		this.senha = u.getSenha();
		this.token = u.getToken();
		this.permissao = u.getPermissao();
		this.nome = u.getNome();
		this.sobrenome = u.getSobrenome();
	}

	

	public int getIdUsu() {
		return this.idUsu;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPermissao() {
		return permissao;
	}

	public void setPermissao(int permissao) {
		this.permissao = permissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
