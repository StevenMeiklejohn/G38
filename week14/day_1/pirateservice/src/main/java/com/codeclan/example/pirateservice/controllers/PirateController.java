package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

    @GetMapping(value="/pirates")
    public ResponseEntity<List<Pirate>> getAllPirates(){
        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }

    @PostMapping(value="/pirates")
    public Pirate postPirate(@RequestBody Pirate pirate){
        pirateRepository.save(pirate);
        return pirate;
    }

    @DeleteMapping(value="/pirates/{id}")
    public Pirate deletePirate(@PathVariable Long id){
        Optional<Pirate> pirateToDelete = pirateRepository.findById(id);
        pirateRepository.delete(pirateToDelete.get());
        return pirateToDelete.get();
    }

    @PutMapping(value="/pirates/{id}")
    public Pirate updatePirate(@RequestBody Pirate updatedPirate, @PathVariable Long id) {
        Pirate existingPirate = pirateRepository.findById(id).get();
        existingPirate.setAge(updatedPirate.getAge());
        existingPirate.setFirstName(updatedPirate.getFirstName());
        existingPirate.setLastName(updatedPirate.getLastName());
        existingPirate.setShip(updatedPirate.getShip());

        pirateRepository.save(existingPirate);
        return existingPirate;
    }

}
