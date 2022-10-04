package com.aula110.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CryptoRepository extends JpaRepository<Crypto, Long> {

    @Query("SELECT c FROM Crypto c WHERE c.rate > 35000")
    List<Crypto> getTopCyptos();

    List<Crypto> findByExchange(String exchange);
    
}
