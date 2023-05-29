package com.duarte.onePieceAPI.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Piratas")
public class Pirata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "estilo_de_luta")
    private String estiloLuta;
    @ManyToOne
    @JoinColumn(name = "tripulacao_id")
    private Tripulacao tripulacao;
    private BigDecimal recompensa;


    @ManyToOne(fetch = FetchType.EAGER)
    private AkumaNoMi akumaNoMi;
    private String haki;


    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "pirata_imagem", joinColumns = @JoinColumn(name = "pirata_id"))
    private List<Imagem> imagens;

    public Pirata() {
    }

    public Pirata(Long id, String nome, String estiloLuta, Tripulacao tripulacao, BigDecimal recompensa, AkumaNoMi akumaNoMi, String haki, List<Imagem> imagens) {
        this.id = id;
        this.nome = nome;
        this.estiloLuta = estiloLuta;
        this.tripulacao = tripulacao;
        this.recompensa = recompensa;
        this.akumaNoMi = akumaNoMi;
        this.haki = haki;
        this.imagens = imagens;
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

    public Tripulacao getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(Tripulacao tripulacao) {
        this.tripulacao = tripulacao;
    }

    public BigDecimal getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(BigDecimal recompensa) {
        this.recompensa = recompensa;
    }

    public AkumaNoMi getAkumaNoMi() {
        return akumaNoMi;
    }

    public void setAkumaNoMi(AkumaNoMi akumaNoMi) {
        this.akumaNoMi = akumaNoMi;
    }

    public String getHaki() {
        return haki;
    }

    public void setHaki(String haki) {
        this.haki = haki;
    }

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }
}
