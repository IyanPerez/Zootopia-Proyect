package com.zootopiaproyect.zootopiaproyect.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zootopiaproyect.zootopiaproyect.models.Animals;
import com.zootopiaproyect.zootopiaproyect.repositories.AnimalsRepository;

@Service
public class AnimalsService {

    private AnimalsRepository repository;

    public AnimalsService(AnimalsRepository repository) {
        this.repository = repository;
    }

    public List<Animals> getAll() {
        return repository.findAll();

    }
    public Animals getOne(Long id){
        Animals animals = repository.findById(id).orElse(null);
        return animals;
    }

    public Animals save(Animals animals) {
        Animals animalsSaved = repository.save(animals);
        return animalsSaved;

    }

    public static Optional<Animals> findById(Long id) {
        return null;
    }
}