package com.aula124.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aula124.project.models.Group;
import com.aula124.project.models.Contact;

public interface GroupRepository extends JpaRepository<Group, Long> {
    
    List<Group> findByName(String name);

    Group getById(long id);

}
