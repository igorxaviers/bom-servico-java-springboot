package com.example.demo.dao;

import com.example.demo.entity.Usuario;
import com.example.demo.bd.Conexao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO {


    public boolean salvar(Usuario u) {
        String sql = "INSERT INTO usuarios (email, senha, token, permissao, nome, sobrenome) VALUES ('$1','$2',$3,$4,'$5','$6')";
        sql = sql.replace("$1", u.getEmail());
        sql = sql.replace("$2", u.getSenha());
        sql = sql.replace("$3", Integer.toString(u.getToken()));
        sql = sql.replace("$4", Integer.toString(u.getPermissao()));
        sql = sql.replace("$5", u.getNome());
        sql = sql.replace("$6", u.getSobrenome());

        Conexao con = new Conexao();
        boolean flag = con.manipular(sql);
        con.fecharConexao();
        return flag;
    }

    public ArrayList<Usuario> getUsuarios(String filtro) {
        ArrayList<Usuario> lista = new ArrayList();
        String sql = "select * from usuarios";
        if (!filtro.isEmpty())
            sql += " where " + filtro;
        sql += " order by id_usu DESC";
        System.out.println(sql);
        Conexao con = new Conexao();
        System.out.println(con);
        ResultSet rs = con.consultar(sql);
        try {
            while (rs.next())
                lista.add(new Usuario(
                                rs.getInt("id_usu"),
                                rs.getString("email"),
                                rs.getString("senha"),
                                rs.getInt("permissao"),
                                rs.getInt("token"),
                                rs.getString("nome"),
                                rs.getString("permissao")));
        } catch (Exception e) {
            System.out.println(e);
        }
        con.fecharConexao();
        return lista;
    }

    public Usuario getUsuario(int id) {
        Usuario u = null;
        String sql = "select * from usuarios where id_usu = " + id;
        Conexao con = new Conexao();
        ResultSet rs = con.consultar(sql);
        try {
            if (rs.next())
                u = new Usuario(
                        rs.getInt("id_usu"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getInt("permissao"),
                        rs.getInt("token"),
                        rs.getString("nome"),
                        rs.getString("permissao"));
        } catch (Exception e) {
            System.out.println(e);
        }
        con.fecharConexao();
        return u;
    }

    public Usuario getUsuarioEmail(String email) {
        Usuario u = null;
        String sql = "select * from usuarios where email = " + email;
        Conexao con = new Conexao();
        ResultSet rs = con.consultar(sql);
        try {
            if (rs.next())
                u = new Usuario(
                        rs.getInt("id_usu"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getInt("permissao"),
                        rs.getInt("token"),
                        rs.getString("nome"),
                        rs.getString("permissao"));
        } catch (Exception e) {
            System.out.println(e);
        }
        con.fecharConexao();
        return u;
    }
}
