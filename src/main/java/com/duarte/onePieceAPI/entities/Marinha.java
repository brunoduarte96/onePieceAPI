package com.duarte.onePieceAPI.entities;

import jakarta.persistence.*;

@Entity
public class Marinha  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "estilo_de_luta")
    private String estiloLuta;

    private String hierarquia;
    @ManyToOne
    private AkumaNoMi akumaNoMi;

    private String haki;

    private String imgUrl;

    public Marinha() {
    }

    public Marinha(Long id, String nome, String estiloLuta, String hierarquia, AkumaNoMi akumaNoMi, String haki, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.estiloLuta = estiloLuta;
        this.hierarquia = hierarquia;
        this.akumaNoMi = akumaNoMi;
        this.haki = haki;
        this.imgUrl = imgUrl;
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

    public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
