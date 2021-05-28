package com.example.demo.controller;
import com.example.demo.dao.AnuncioDAO;
import com.example.demo.entity.Anuncio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnuncioController {
    @RequestMapping(value = "/anuncios/cadastrar", method = RequestMethod.POST)
    public ResponseEntity<Object> cadUsuario(@RequestBody Anuncio anuncio){
        String retorno;
        AnuncioDAO aDAO = new AnuncioDAO();
        if(aDAO.salvar(anuncio))
            retorno="Gravado com sucesso";
        else
            retorno="Deu errado";

        return new ResponseEntity<>(retorno, HttpStatus.CREATED);
    }

    @RequestMapping(value="/anuncios/listar")
    public ResponseEntity <Object> listAnuncios()
    {
        Map<String,Anuncio> mapAnuncios = new HashMap<>();
        List<Anuncio> anuncios = new AnuncioDAO().getAnuncios("");
        for(Anuncio a : anuncios)
            mapAnuncios.put(""+a.getTitulo(), a);
        return new ResponseEntity<>(mapAnuncios.values(),HttpStatus.OK);
    }
}
