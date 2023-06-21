package com.duarte.onePieceAPI.repositories;

import com.duarte.onePieceAPI.entities.AkumaNoMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AkumaNoMiRepository extends JpaRepository<AkumaNoMi, Long> {
    AkumaNoMi findByNome(String nome);
}
