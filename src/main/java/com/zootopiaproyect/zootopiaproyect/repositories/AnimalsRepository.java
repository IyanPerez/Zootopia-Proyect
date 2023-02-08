package com.zootopiaproyect.zootopiaproyect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zootopiaproyect.zootopiaproyect.models.Animals;

public interface AnimalsRepository extends JpaRepository<Animals, Long> {

    
};
