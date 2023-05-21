package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Pirata;
import com.duarte.onePieceAPI.entities.Tripulacao;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class TripulacaoDTO {

    private Long id;
    private String nome;
    private List<Pirata> piratas;
    private String capitao;
    private String navio;

    public TripulacaoDTO() {
    }

    public TripulacaoDTO(Long id, String nome, List<Pirata> piratas, String capitao, String navio) {
        this.id = id;
        this.nome = nome;
        this.piratas = piratas;
        this.capitao = capitao;
        this.navio = navio;
    }

    public TripulacaoDTO(Tripulacao tripulacao) {
        BeanUtils.copyProperties(tripulacao, this);
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

    public List<Pirata> getPiratas() {
        return piratas;
    }

    public void setPiratas(List<Pirata> piratas) {
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
