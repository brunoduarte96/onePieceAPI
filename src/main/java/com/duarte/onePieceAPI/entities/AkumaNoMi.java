package com.duarte.onePieceAPI.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class AkumaNoMi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> tipo;

    @OneToMany(mappedBy = "akumaNoMi")
    private List<Pirata> pirata;

    @OneToMany(mappedBy = "akumaNoMi")
    private List<Marinha> marinha;

    private String imgUrl;

    public AkumaNoMi() {
    }

    public AkumaNoMi(Long id, String nome, List<String> tipo, List<Pirata> pirata, List<Marinha> marinha, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.pirata = pirata;
        this.marinha = marinha;
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

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
        this.tipo = tipo;
    }

    public List<Pirata> getPirata() {
        return pirata;
    }

    public void setPirata(List<Pirata> pirata) {
        this.pirata = pirata;
    }

    public List<Marinha> getMarinha() {
        return marinha;
    }

    public void setMarinha(List<Marinha> marinha) {
        this.marinha = marinha;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

