package com.duarte.onePieceAPI.repositories;

import com.duarte.onePieceAPI.entities.Marinha;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarinhaRepository extends JpaRepository<Marinha, Long> {
    @EntityGraph(attributePaths = "hierarquia")
    List<Marinha> findByNomeContainingIgnoreCase(String nome);
}
