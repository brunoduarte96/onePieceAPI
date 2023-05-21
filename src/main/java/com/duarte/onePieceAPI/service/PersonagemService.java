package com.duarte.onePieceAPI.service;

import com.duarte.onePieceAPI.dto.MarinhaDTO;
import com.duarte.onePieceAPI.dto.PirataDTO;
import com.duarte.onePieceAPI.entities.Marinha;
import com.duarte.onePieceAPI.entities.Pirata;
import com.duarte.onePieceAPI.repositories.MarinhaRepository;
import com.duarte.onePieceAPI.repositories.PirataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PirataRepository pirataRepository;

    @Autowired
    private MarinhaRepository marinhaRepository;


    public List<Object> listarPersonagens() {
        List<PirataDTO> piratasDTO = pirataRepository.findAll().stream()
                .map(PirataDTO::new)
                .toList();

        List<MarinhaDTO> marinheirosDTO = marinhaRepository.findAll().stream()
                .map(MarinhaDTO::new)
                .toList();

        List<Object> personagens = new ArrayList<>();
        personagens.addAll(piratasDTO);
        personagens.addAll(marinheirosDTO);

        return personagens;
    }

    public List<Object> buscarPersonagensPorNome(String nome) {
        List<Pirata> piratasEncontrados = pirataRepository.findByNomeContainingIgnoreCase(nome);
        List<Marinha> marinheirosEncontrados = marinhaRepository.findByNomeContainingIgnoreCase(nome);

        List<PirataDTO> pirataDTO = piratasEncontrados.stream()
                .map(PirataDTO::new)
                .toList();
        List<MarinhaDTO> marinheirosDTO = marinheirosEncontrados.stream()
                .map(MarinhaDTO::new)
                .toList();

        List<Object> personagens = new ArrayList<>();
        personagens.addAll(pirataDTO);
        personagens.addAll(marinheirosDTO);

        return personagens;
    }


}
