package com.duarte.onePieceAPI.repositories;


import com.duarte.onePieceAPI.entities.Tripulacao;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripulacaoRepository extends JpaRepository<Tripulacao, Long> {

    @EntityGraph(attributePaths = "piratas")
    List<Tripulacao> findAll();

}
