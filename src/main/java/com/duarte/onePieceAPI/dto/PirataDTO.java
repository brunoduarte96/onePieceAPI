package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Pirata;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

public class PirataDTO {

    private Long id;
    private String nome;
    private String estiloLuta;
    private String tripulacao;
    private BigDecimal recompensa;

    private String akumaNoMi;
    private String haki;

    public PirataDTO(){

    }

    public PirataDTO(Pirata pirata){
        BeanUtils.copyProperties(pirata,this);
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

    public String getEstiloLuta() {
        return estiloLuta;
    }

    public void setEstiloLuta(String estiloLuta) {
        this.estiloLuta = estiloLuta;
    }

    public String getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(String tripulacao) {
        this.tripulacao = tripulacao;
    }

    public BigDecimal getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(BigDecimal recompensa) {
        this.recompensa = recompensa;
    }

    public String getAkumaNoMi() {
        return akumaNoMi;
    }

    public void setAkumaNoMi(String akumaNoMi) {
        this.akumaNoMi = akumaNoMi;
    }

    public String getHaki() {
        return haki;
    }

    public void setHaki(String haki) {
        this.haki = haki;
    }
}


