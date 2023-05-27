package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Hierarquia;
import com.duarte.onePieceAPI.entities.Marinha;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class HierarquiaDTO {
    private Long id;
    private String cargo;
    private List<Marinha> marinha;

    public HierarquiaDTO() {

    }

    public HierarquiaDTO(Hierarquia hierarquia) {
        BeanUtils.copyProperties(hierarquia, this);
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
