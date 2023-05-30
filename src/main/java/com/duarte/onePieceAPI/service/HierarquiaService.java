package com.duarte.onePieceAPI.service;

import com.duarte.onePieceAPI.dto.HierarquiaDTO;
import com.duarte.onePieceAPI.entities.Hierarquia;
import com.duarte.onePieceAPI.entities.Marinha;
import com.duarte.onePieceAPI.repositories.HierarquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HierarquiaService {

    @Autowired
    private HierarquiaRepository hierarquiaRepository;


    public List<HierarquiaDTO>listarHierarquia(){
        List<Hierarquia> hierarquias = hierarquiaRepository.findAll();
        return hierarquias.stream()
                .map(hierarquia -> {
                    HierarquiaDTO hierarquiaDTO = new HierarquiaDTO(hierarquia);
                    hierarquiaDTO.setMarinha(hierarquia.getMarinha().stream()
                            .map(Marinha::getNome)
                            .collect(Collectors.toList()));
                    return hierarquiaDTO;

                })
                .collect(Collectors.toList());
    }

    public List<Object> buscarHierarquiaPorCargo(String cargo) {
        List<Hierarquia> hierarquiaEncontrada = hierarquiaRepository.findByCargoContainingIgnoreCase(cargo);

        return hierarquiaEncontrada.stream()
                .map(hierarquia -> {
                    HierarquiaDTO hierarquiaDTO = new HierarquiaDTO(hierarquia);
                    List<String> cargoMarinha = hierarquia.getMarinha().stream()
                            .map(Marinha::getNome)
                            .collect(Collectors.toList());
                    hierarquiaDTO.setMarinha(cargoMarinha);
                    return hierarquiaDTO;
                })
                .collect(Collectors.toList());
    }




}
