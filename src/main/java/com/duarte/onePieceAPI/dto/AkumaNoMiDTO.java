package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.AkumaNoMi;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class AkumaNoMiDTO {

    private Long id;
    private String nome;
    private String tipo;
    private List<PirataDTO> pirata;
    private List<MarinhaDTO> marinha;
    private String imgUrl;

    public AkumaNoMiDTO() {

    }

    public AkumaNoMiDTO(Long id, String nome, String tipo, List<PirataDTO> pirata, List<MarinhaDTO> marinha, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.pirata = pirata;
        this.marinha = marinha;
        this.imgUrl = imgUrl;
    }
    public AkumaNoMiDTO(AkumaNoMi akumaNoMi) {
        BeanUtils.copyProperties(akumaNoMi,this);
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<PirataDTO> getPirata() {
        return pirata;
    }

    public void setPirata(List<PirataDTO> pirata) {
        this.pirata = pirata;
    }

    public List<MarinhaDTO> getMarinha() {
        return marinha;
    }

    public void setMarinha(List<MarinhaDTO> marinha) {
        this.marinha = marinha;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
