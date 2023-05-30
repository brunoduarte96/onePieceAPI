package com.duarte.onePieceAPI.repositories;

import com.duarte.onePieceAPI.entities.Hierarquia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HierarquiaRepository extends JpaRepository<Hierarquia, Long> {
    List<Hierarquia> findByCargoContainingIgnoreCase(String cargo);
}
