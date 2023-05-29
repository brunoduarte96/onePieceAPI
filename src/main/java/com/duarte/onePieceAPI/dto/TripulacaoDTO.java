package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Pirata;
import com.duarte.onePieceAPI.entities.Tripulacao;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class TripulacaoDTO {

    private Long id;
    private String nome;
    private List<String> piratas;
    private String capitao;
    private String navio;

    public TripulacaoDTO() {
    }

    public TripulacaoDTO(Tripulacao tripulacao) {
        BeanUtils.copyProperties(tripulacao, this);
        List<Pirata> piratas = tripulacao.getPiratas();
        List<String> nomePiratas = new ArrayList<>();
        for (Pirata pirata : piratas) {
            nomePiratas.add(pirata.getNome());
        }
        this.piratas = nomePiratas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getPiratas() {
        return piratas;
    }

    public void setPiratas(List<String> piratas) {
        this.piratas = piratas;
    }

    public String getCapitao() {
        return capitao;
    }

    public void setCapitao(String capitao) {
        this.capitao = capitao;
    }

    public String getNavio() {
        return navio;
    }

    public void setNavio(String navio) {
        this.navio = navio;
    }
}
