package com.duarte.onePieceAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Tripulacao")
public class Tripulacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "tripulacao")
    private List<Pirata> piratas;

    @Column(name = "capitao")
    private String capitao;

    @Column(name = "navio")
    private String navio;

    private String imgUrl;


    public Tripulacao() {
    }

    public Tripulacao(Long id, String nome, List<Pirata> piratas, String capitao, String navio, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.piratas = piratas;
        this.capitao = capitao;
        this.navio = navio;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
