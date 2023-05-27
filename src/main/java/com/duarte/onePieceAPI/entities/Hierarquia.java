package com.duarte.onePieceAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Hierarquia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargo;

    @OneToMany(mappedBy = "hierarquia")
    private List<Marinha> marinha;

    public Hierarquia() {
    }

    public Hierarquia(Long id, String cargo, List<Marinha> marinha) {
        this.id = id;
        this.cargo = cargo;
        this.marinha = marinha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Marinha> getMarinha() {
        return marinha;
    }

    public void setMarinha(List<Marinha> marinha) {
        this.marinha = marinha;
    }
}
