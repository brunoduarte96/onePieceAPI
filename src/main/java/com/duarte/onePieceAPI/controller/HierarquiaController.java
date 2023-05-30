package com.duarte.onePieceAPI.controller;

import com.duarte.onePieceAPI.dto.HierarquiaDTO;
import com.duarte.onePieceAPI.entities.Hierarquia;
import com.duarte.onePieceAPI.service.HierarquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/hierarquia")
public class HierarquiaController {


    @Autowired
    private HierarquiaService hierarquiaService;


    @Transactional
    @GetMapping
    public List<EntityModel<HierarquiaDTO>> listarHierarquia() {
        List<HierarquiaDTO> hierarquias = hierarquiaService.listarHierarquia();

        return hierarquias.stream()
                .map(hierarquia -> {
                    String cargo = hierarquia.getCargo();

                    Link buscarCargoLink = WebMvcLinkBuilder.linkTo(HierarquiaController.class)
                            .slash(cargo)
                            .withRel("buscarCargo");
                    return EntityModel.of(hierarquia, buscarCargoLink);
                })
                .collect(Collectors.toList());
    }

    @Transactional
    @GetMapping("/{cargo}")
    public List<Object>listarHierarquiaPorNome(@PathVariable("cargo")String cargo){
        return hierarquiaService.buscarHierarquiaPorCargo(cargo);
    }



}
