package com.duarte.onePieceAPI.controller;

import com.duarte.onePieceAPI.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @Transactional
    @GetMapping
    public List<Object> listarPersonagens() {
        return personagemService.listarPersonagens();
    }

    @GetMapping("/{nome}")
    public List<Object> buscarPersonagemPorNome(@PathVariable("nome") String nome) {
        return personagemService.buscarPersonagensPorNome(nome);
    }


}
