package com.example.demo.dao;

import com.example.demo.entity.Categoria;
import com.example.demo.bd.Conexao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoriaDao {
  public boolean save(Categoria cat) {
    String sql = "INSERT INTO categorias (label) values ('$1')";
    sql = sql.replace("$1", cat.getLabel());
    Conexao con = new Conexao();
    boolean flag = con.manipular(sql);
    con.fecharConexao();
    return flag;
  }

  public boolean update(Categoria cat) {
    String sql = "UPDATE categorias set label = ('$1') WHERE = " + cat.getIdCat();
    sql = sql.replace("$1", cat.getLabel());
    Conexao con = new Conexao();
    boolean flag = con.manipular(sql);
    con.fecharConexao();
    return flag;
  }

  public boolean destroy(int id) {
    String sql = "DELETE FROM categorias WHERE = " + id;
    Conexao con = new Conexao();
    boolean flag = con.manipular(sql);
    con.fecharConexao();
    return flag;
  }

  public ArrayList<Categoria> getCategorias(String filtro) {
    ArrayList<Categoria> lista = new ArrayList<>();
    String sql = "select * from categorias";
    if (!filtro.isEmpty())
      sql += " where " + filtro;
    sql += " order by id_cat DESC";
    System.out.println(sql);
    Conexao con = new Conexao();
    System.out.println(con);
    ResultSet rs = con.consultar(sql);
    try {
      while (rs.next())
        lista.add(new Categoria(1,rs.getString("label");
    } catch (Exception e) {
        System.out.println(e);
    }
    con.fecharConexao();
    return lista;
  }

  public Categoria getCategoria(int id) {
    Categoria cat = null;
    String sql = "select * from catscatarios where id_catscat = " + id;
    Conexao con = new Conexao();
    ResultSet rs = con.consultar(sql);
    try {
      if(rs.next())
        cat = new Categoria(rs.getInt("id_cat"), rs.getString("label"));
    } catch (Exception e) {
      System.out.println(e);
    }
    con.fecharConexao();
    return cat;
  }
}
