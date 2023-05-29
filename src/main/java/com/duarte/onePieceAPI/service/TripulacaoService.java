package com.duarte.onePieceAPI.service;

import com.duarte.onePieceAPI.dto.TripulacaoDTO;
import com.duarte.onePieceAPI.entities.Pirata;
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


    public List<TripulacaoDTO> listarTripulacoes() {
        List<Tripulacao> tripulacoes = tripulacaoRepository.findAll();
        return tripulacoes.stream()
                .map(tripulacao -> {
                    TripulacaoDTO tripulacaoDTO = new TripulacaoDTO(tripulacao);
                    tripulacaoDTO.setPiratas(tripulacao.getPiratas().stream()
                            .map(Pirata::getNome)
                            .collect(Collectors.toList()));
                    return tripulacaoDTO;
                })
                .collect(Collectors.toList());
    }


    public List<Object> buscarTripulacaoPorNome(String nome) {
        List<Tripulacao> tripulacaoEncontrados = tripulacaoRepository.findByNomeContainingIgnoreCase(nome);

        return tripulacaoEncontrados.stream()
                .map(tripulacao -> {
                    TripulacaoDTO tripulacaoDTO = new TripulacaoDTO(tripulacao);
                    List<String> nomesPiratas = tripulacao.getPiratas().stream()
                            .map(Pirata::getNome)
                            .collect(Collectors.toList());
                    tripulacaoDTO.setPiratas(nomesPiratas);
                    return tripulacaoDTO;
                })
                .collect(Collectors.toList());
    }


}



