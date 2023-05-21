package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Marinha;
import org.springframework.beans.BeanUtils;

public class MarinhaDTO {

    private Long id;
    private String nome;
    private String estiloLuta;
    private String hierarquia;
    private String akumaNoMi;
    private String haki;

    public MarinhaDTO() {

    }

    public MarinhaDTO(Marinha marinha) {
        BeanUtils.copyProperties(marinha, this);
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
