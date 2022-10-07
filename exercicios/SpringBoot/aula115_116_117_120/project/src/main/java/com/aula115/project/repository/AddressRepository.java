package com.aula115.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula115.project.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
