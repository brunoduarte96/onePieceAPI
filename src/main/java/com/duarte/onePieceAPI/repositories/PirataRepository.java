package com.duarte.onePieceAPI.repositories;


import com.duarte.onePieceAPI.entities.Pirata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PirataRepository extends JpaRepository<Pirata, Long> {
}
