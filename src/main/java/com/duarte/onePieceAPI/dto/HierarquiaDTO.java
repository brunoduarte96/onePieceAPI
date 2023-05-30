package com.duarte.onePieceAPI.dto;

import com.duarte.onePieceAPI.entities.Hierarquia;
import com.duarte.onePieceAPI.entities.Marinha;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class HierarquiaDTO {
    private Long id;
    private String cargo;
    private List<String> marinha;

    public HierarquiaDTO() {

    }

    public HierarquiaDTO(Hierarquia hierarquia) {
        BeanUtils.copyProperties(hierarquia, this);
        List<Marinha> marinhas = hierarquia.getMarinha();
        List<String> cargoMarinha = new ArrayList<>();

        for (Marinha marinha : marinhas) {
            cargoMarinha.add(marinha.getNome());
        }
        this.marinha = cargoMarinha;
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

    public List<String> getMarinha() {
        return marinha;
    }

    public void setMarinha(List<String> marinha) {
        this.marinha = marinha;
    }
}
