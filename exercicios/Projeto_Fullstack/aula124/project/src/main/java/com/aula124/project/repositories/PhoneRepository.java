package com.aula124.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula124.project.models.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
    
    Phone findByPhoneNumber(String phoneNumber);

}
