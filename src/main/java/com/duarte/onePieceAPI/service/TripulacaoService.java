package com.duarte.onePieceAPI.service;

import com.duarte.onePieceAPI.dto.TripulacaoDTO;
import com.duarte.onePieceAPI.entities.Tripulacao;
import com.duarte.onePieceAPI.repositories.TripulacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripulacaoService {

    @Autowired
    private TripulacaoRepository tripulacaoRepository;


    public List<TripulacaoDTO> listarTripulacao() {
        List<Tripulacao> tripulacoes = tripulacaoRepository.findAll();
        return tripulacoes.stream()
                .map(TripulacaoDTO::new)
                .collect(Collectors.toList());
    }


}
