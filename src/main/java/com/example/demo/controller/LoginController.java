package com.example.demo.controller;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.entity.Usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    @RequestMapping(value = "/logar", method = RequestMethod.POST)
    public String logar(@RequestBody Usuario usuario, HttpServletRequest request, HttpSession session)
    {
        UsuarioDAO uDao = new UsuarioDAO();
        Usuario u = uDao.getUsuarioEmail(usuario.getEmail());

        if(u.getSenha() == usuario.getSenha()){
            createSession(request, session, u);
            return "index.html";
        }
        else
            return "login.html";
    }

    public void createSession(HttpServletRequest request, HttpSession session, Usuario u){
        session.invalidate();
        session = request.getSession(true);
        
        session.setAttribute("email", u.getEmail());
        session.setAttribute("user", u.getNome() + " " + u.getSobrenome());
        session.setAttribute("permissao", u.getPermissao());
    }
    
    
}
