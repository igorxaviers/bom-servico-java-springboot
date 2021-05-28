package com.example.demo.dao;

import com.example.demo.entity.Anuncio;
import com.example.demo.entity.Localidade;
import com.example.demo.entity.Usuario;
import com.example.demo.entity.Categoria;
import com.example.demo.bd.Conexao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.util.ArrayList;

public class AnuncioDAO {
    
    public boolean salvar(Anuncio a) {
        String sql = "INSERT INTO anuncios (titulo, descricao, preco, contato, id_localidade, id_cat, id_usu) VALUES ('$1','$2',$3,'$4',$5,$6,$7)";
        sql = sql.replace("$1", a.getTitulo());
        sql = sql.replace("$2", a.getDescricao());
        sql = sql.replace("$3", Double.toString(a.getPreco()));
        sql = sql.replace("$4", a.getContato());
        sql = sql.replace("$5", Integer.toString(a.getLocalidade().getId_localidade()));
        sql = sql.replace("$6", Integer.toString(a.getCategoria().getId_cat()));
        sql = sql.replace("$7", Integer.toString(a.getUsuario().getIdUsu()));

        Conexao con = new Conexao();
        boolean flag = con.manipular(sql);
        con.fecharConexao();
        return flag;
    }

    public ArrayList<Anuncio> getAnuncios(String filtro) {
        ArrayList<Anuncio> lista = new ArrayList();
        String sql = "select * from anuncios";
        if (!filtro.isEmpty())
            sql += " where " + filtro;
        sql += " order by id_anu DESC";
        Conexao con = new Conexao();
        ResultSet rs = con.consultar(sql);
        try {
            while (rs.next())
                lista.add(new Anuncio(
                            rs.getInt("id_anu"),
                            rs.getString("titulo"),
                            rs.getString("descricao"),
                            rs.getDouble("preco"),
                            rs.getString("contato"),
                            new Localidade(rs.getInt("id_localidade")),
                            new Categoria(rs.getInt("id_cat")),
                            new Usuario(rs.getInt("id_usu"))));
        } catch (Exception e) {
            System.out.println(e);
        }
        con.fecharConexao();
        return lista;
    }

}

