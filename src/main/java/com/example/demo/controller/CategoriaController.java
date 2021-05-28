package com.example.demo.controller;
import javax.servlet.http.HttpSession;

import com.example.demo.entity.Categoria;

import javax.servlet.http.HttpServletRequest;

// import com.example.demo.dao.UsuarioDAO;
// import com.example.demo.entity.Usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
// @RequestMapping(value = "/categoria/cadastrar")
public class CategoriaController{

    @GetMapping("/cadastroC")
    public String index(){
      return "cadastro-categoria.html";
    }

    @RequestMapping(value = "/categoria/create", method = RequestMethod.POST)
    public String create(@RequestBody Categoria categoria, HttpServletRequest request, HttpSession session)
    {
      //UsuarioDAO uDao = new UsuarioDAO();
      //Usuario u = uDao.getUsuarioEmail(usuario.getEmail());

      // if(u.getSenha() == usuario.getSenha()){

      // }
      // else
      //     return "index.html";
      return "Cadastrado com sucesso";
    }


}
