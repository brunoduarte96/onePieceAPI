package com.duarte.onePieceAPI.controller;

import com.duarte.onePieceAPI.dto.TripulacaoDTO;
import com.duarte.onePieceAPI.service.TripulacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
    @RequestMapping("/api/v1/tripulacao")
public class TripulacaoController {

    @Autowired
   private TripulacaoService tripulacaoService;


    @Transactional
    @GetMapping
    public List<TripulacaoDTO>listarTripulacao(){
        return tripulacaoService.listarTripulacoes();
    }

    @Transactional
    @GetMapping("/{nome}")
    public List<Object>listarTripulacaoPorNome(@PathVariable("nome")String nome) {
        return Collections.singletonList(tripulacaoService.buscarTripulacaoPorNome(nome));
    }

}
