package com.duarte.onePieceAPI.controller;

import com.duarte.onePieceAPI.dto.MarinhaDTO;
import com.duarte.onePieceAPI.dto.PirataDTO;
import com.duarte.onePieceAPI.entities.Marinha;
import com.duarte.onePieceAPI.entities.Pirata;
import com.duarte.onePieceAPI.repositories.MarinhaRepository;
import com.duarte.onePieceAPI.repositories.PirataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PirataRepository pirataRepository;

    @Autowired
    private MarinhaRepository marinhaRepository;


    @GetMapping
    public List<Object> listarPersonagens(){
        List<Pirata> piratas = pirataRepository.findAll();
        List<Marinha> marinheiros = marinhaRepository.findAll();

        List<Object> personagens = new ArrayList<>();

        for (Pirata pirata : piratas){
            PirataDTO pirataDTO = new PirataDTO(pirata);
            personagens.add(pirataDTO);
        }
        for (Marinha marinheiro : marinheiros) {
            MarinhaDTO marinhaDTO = new MarinhaDTO(marinheiro);
            personagens.add(marinhaDTO);
        }

        return personagens;

    }


}
