package com.duarte.onePieceAPI.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Piratas")

public class Pirata  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "estilo_de_luta")
    private String estiloLuta;

    @Column(name = "tripulação")
    private String tripulacao;
    private BigDecimal recompensa;
    @Column(name = "Akuma_no_mi")
    private String akumaNoMi;
    private String haki;


    public Pirata() {
    }

    public Pirata(Long id, String nome, String estiloLuta, String tripulacao, BigDecimal recompensa, String akumaNoMi, String haki) {
        this.id = id;
        this.nome = nome;
        this.estiloLuta = estiloLuta;
        this.tripulacao = tripulacao;
        this.recompensa = recompensa;
        this.akumaNoMi = akumaNoMi;
        this.haki = haki;
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
