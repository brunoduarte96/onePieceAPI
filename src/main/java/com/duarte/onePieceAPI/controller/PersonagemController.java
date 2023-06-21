package com.duarte.onePieceAPI.controller;

import com.duarte.onePieceAPI.dto.MarinhaDTO;
import com.duarte.onePieceAPI.dto.PirataDTO;
import com.duarte.onePieceAPI.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/v1/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @Transactional
    @GetMapping
    public List<EntityModel<Object>> listarPersonagens() {
        List<Object> personagens = personagemService.listarPersonagens();

        return personagens.stream()
                .map(personagem -> {
                    String nome ="";
                    if (personagem instanceof PirataDTO) {
                        nome = ((PirataDTO) personagem).getNome();
                    } else if (personagem instanceof MarinhaDTO) {
                        nome = ((MarinhaDTO) personagem).getNome();
                    }


                    Link buscarPorNomeLink = WebMvcLinkBuilder.linkTo(methodOn(PersonagemController.class).buscarPersonagemPorNome(nome)).withRel("buscarPorNome");
                    return EntityModel.of(personagem, buscarPorNomeLink);
                })
                .collect(Collectors.toList());
    }

    @Transactional
    @GetMapping("/{nome}")
    public List<EntityModel<Object>> buscarPersonagemPorNome(@PathVariable("nome") String nome) {
        List<Object> personagens = personagemService.buscarPersonagensPorNome(nome);

        return personagens.stream()
                .map(personagem -> EntityModel.of(personagem,
                        WebMvcLinkBuilder.linkTo(methodOn(PersonagemController.class).buscarPersonagemPorNome(nome)).withSelfRel()))
                .collect(Collectors.toList());


    }


    @PostMapping
    public ResponseEntity<String>adicionarPirata(@RequestBody PirataDTO pirataDTO){
        personagemService.adicionarNovoPirata(pirataDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pirata adicionadp");
    }

}
