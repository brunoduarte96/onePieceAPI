package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Marinha;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class MarinhaDTO {

    private Long id;
    private String nome;
    private String estiloLuta;
    private String hierarquia;
    private String akumaNoMi;
    private List<String> tipoAkumaNoMi;
    private String haki;
    private String imgUrl;

    public MarinhaDTO() {

    }

    public MarinhaDTO(Marinha marinha) {
        BeanUtils.copyProperties(marinha, this);
        if(marinha.getAkumaNoMi()!=null){
            this.akumaNoMi = marinha.getAkumaNoMi().getNome();
            this.tipoAkumaNoMi = marinha.getAkumaNoMi().getTipo();
        }
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<String> getTipoAkumaNoMi() {
        return tipoAkumaNoMi;
    }

    public void setTipoAkumaNoMi(List<String> tipoAkumaNoMi) {
        this.tipoAkumaNoMi = tipoAkumaNoMi;
    }
}
