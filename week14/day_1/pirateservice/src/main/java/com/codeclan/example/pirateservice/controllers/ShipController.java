package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Ship;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import com.codeclan.example.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value="/ships")
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    @GetMapping(value="/ships/{id}")
    public Optional<Ship> getShip(@PathVariable Long id){
        return shipRepository.findById(id);
    }

    @GetMapping(value="/ships/pirates")
    public List<Ship> findShipsThatHavePiratesNamedQueryString(@RequestParam(name="named") String name){
        return shipRepository.findByPiratesFirstName(name);
    }
}
