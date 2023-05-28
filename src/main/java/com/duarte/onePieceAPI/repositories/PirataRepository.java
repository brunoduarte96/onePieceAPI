package com.duarte.onePieceAPI.repositories;


import com.duarte.onePieceAPI.entities.Pirata;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirataRepository extends JpaRepository<Pirata, Long> {
    @EntityGraph(attributePaths = { "imagens", "tripulacao" })
    List<Pirata> findByNomeContainingIgnoreCase(String nome);

}
