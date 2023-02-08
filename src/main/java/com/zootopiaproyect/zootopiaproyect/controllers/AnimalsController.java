package com.zootopiaproyect.zootopiaproyect.controllers;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zootopiaproyect.zootopiaproyect.models.Animals;

import com.zootopiaproyect.zootopiaproyect.services.AnimalsService;

@RestController
@RequestMapping(path = "/api/animals")
public class AnimalsController {
    
private AnimalsService service;

    public AnimalsController(AnimalsService service) {
    this.service = service;
}


    @GetMapping(value = "")
    public List<Animals> index() {
        return service.getAll();

    }
    @PostMapping(value = "")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Animals newAnimals) {

        try {
            return ResponseEntity.ok(service.save(newAnimals));

        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }

    }

}
