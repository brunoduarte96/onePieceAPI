package com.duarte.onePieceAPI.repositories;

import com.duarte.onePieceAPI.entities.Hierarquia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HierarquiaRepository extends JpaRepository<Hierarquia, Long> {
}
