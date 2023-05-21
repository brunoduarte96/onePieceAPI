package com.duarte.onePieceAPI.repositories;


import com.duarte.onePieceAPI.entities.Tripulacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TripulacaoRepository extends JpaRepository<Tripulacao, Long> {

    @Query("SELECT t FROM Tripulacao t LEFT JOIN FETCH t.piratas WHERE t.id = :id")
    Optional<Tripulacao> findByIdWithPiratas(@Param("id") Long id);

}
