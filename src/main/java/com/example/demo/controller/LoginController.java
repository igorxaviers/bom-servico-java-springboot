package com.example.demo.controller;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.entity.Usuario;

import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Object> logar(@RequestBody Usuario usuario, HttpServletRequest request, HttpSession session)
    {
        UsuarioDAO uDao = new UsuarioDAO();
        Usuario u = uDao.verificaUsuario(usuario.getEmail(), usuario.getSenha());

        if(u != null){
            createSession(request, session, u);
            return new ResponseEntity<>("home", HttpStatus.CREATED);
        }
        else
            return new ResponseEntity<>("index.html", HttpStatus.CREATED);
    }

    public void createSession(HttpServletRequest request, HttpSession session, Usuario u){
        if(!session.isNew())
            session.invalidate();
        session = request.getSession(true);        
        session.setAttribute("usuario", u);
    }
    
    
}
