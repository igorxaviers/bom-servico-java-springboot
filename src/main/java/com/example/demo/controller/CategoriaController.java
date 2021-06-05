package com.example.demo.controller;
import javax.servlet.http.HttpSession;

import com.example.demo.dao.CategoriaDao;
import com.example.demo.entity.Categoria;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.example.demo.dao.UsuarioDAO;
// import com.example.demo.entity.Usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(value = "categorias")
public class CategoriaController{
  
  @GetMapping("/categoria-nova")
  public String index(){
    return "cadastro-categoria.html";
  }
  
  @RequestMapping(value = "/categoria-create", method = RequestMethod.POST)
    public String create(@RequestBody String categoria, HttpServletRequest request /*,HttpSession session*/)
    {
      CategoriaDao catDao = new CategoriaDao();
      Categoria cat = new Categoria(0, categoria);

      if(catDao.save(cat)){
        return "Cadastrado com sucesso";
      }

      return "Erro: Não foi possivel cadastrar a categoria!";
    }


}
