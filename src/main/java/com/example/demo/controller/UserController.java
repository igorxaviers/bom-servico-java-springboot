package com.example.demo.controller;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.entity.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping(value = "/users/cadastrar", method = RequestMethod.POST)
    public ResponseEntity<Object> cadUsuario(@RequestBody Usuario usuario){
        UsuarioDAO uDAO = new UsuarioDAO();
        System.out.println(usuario);
        uDAO.salvar(usuario);
        String retorno="Gravado com sucesso";
        System.out.println("deu certo");
        return new ResponseEntity<>(retorno, HttpStatus.CREATED);
    }

    @RequestMapping(value="/users/listar")
    public ResponseEntity <Object> listUsuarios()
    {
        Map<String,Usuario> mapUsuarios = new HashMap<>();
        List<Usuario> usuarios = new UsuarioDAO().getUsuarios("");
        for(Usuario u : usuarios)
            mapUsuarios.put(""+u.getNome(), u);
        return new ResponseEntity<>(mapUsuarios.values(),HttpStatus.OK);
    }

    @RequestMapping(value="/users/buscar")
    public ResponseEntity <Object> buscar(@RequestParam(value="id") int id)
    {
        Usuario u = new UsuarioDAO().getUsuario(id);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }



}
