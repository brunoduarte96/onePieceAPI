package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Imagem;
import com.duarte.onePieceAPI.entities.Pirata;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;
import java.util.List;

public class PirataDTO extends RepresentationModel<PirataDTO> {

    private Long id;
    private String nome;
    private String estiloLuta;
    private String tripulacao;
    private BigDecimal recompensa;
    private String akumaNoMi;
    private List<String> tipoAkumaNoMi;
    private String haki;
    private List<Imagem> imagens;


    public PirataDTO() {
    }

    public PirataDTO(Pirata pirata) {
        BeanUtils.copyProperties(pirata, this);
        if (pirata.getTripulacao() != null) {
            this.tripulacao = pirata.getTripulacao().getNome();
        }
        if (pirata.getAkumaNoMi() != null) {
            this.akumaNoMi = pirata.getAkumaNoMi().getNome();
            this.tipoAkumaNoMi = pirata.getAkumaNoMi().getTipo();
        }
        this.imagens = pirata.getImagens();
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

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }

    public List<String> getTipoAkumaNoMi() {
        return tipoAkumaNoMi;
    }

    public void setTipoAkumaNoMi(List<String> tipoAkumaNoMi) {
        this.tipoAkumaNoMi = tipoAkumaNoMi;
    }
}
