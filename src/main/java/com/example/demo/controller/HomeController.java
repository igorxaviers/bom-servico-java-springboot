package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.entity.Usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(HttpSession session){
        Object u = session.getAttribute("usuario");
        
        return "index.html";
    }

}
