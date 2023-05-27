package com.duarte.onePieceAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Marinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "estilo_de_luta")
    private String estiloLuta;

    @ManyToOne
    @JoinColumn(name = "hierarquia_id")
    private Hierarquia hierarquia;
    @ManyToOne
    private AkumaNoMi akumaNoMi;

    private String haki;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "marinha_imagem", joinColumns = @JoinColumn(name = "marinha_id"))
    private List<Imagem> imagens;

    public Marinha() {
    }

    public Marinha(Long id, String nome, String estiloLuta, Hierarquia hierarquia, AkumaNoMi akumaNoMi, String haki, List<Imagem> imagens) {
        this.id = id;
        this.nome = nome;
        this.estiloLuta = estiloLuta;
        this.hierarquia = hierarquia;
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

    public Hierarquia getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(Hierarquia hierarquia) {
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

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }
}
