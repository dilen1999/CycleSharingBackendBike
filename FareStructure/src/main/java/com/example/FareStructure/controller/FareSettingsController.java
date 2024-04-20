package com.example.FareStructure.controller;

import com.example.FareStructure.model.FareSettings;
import com.example.FareStructure.repository.FareSettingsrepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FareSettingsController {
    @Autowired
    private FareSettingsrepository fareSettingsrepository;

    @PostMapping("/farepost")
    FareSettings newFareSettings(@RequestBody FareSettings newFareSettings){
        return fareSettingsrepository.save(newFareSettings);
    }
    @GetMapping("/faregetAll")
    List<FareSettings> getAllFareSettings() {
        return fareSettingsrepository.findAll();
    }
    @GetMapping("/fare/lastFareDetails")
    public FareSettings getLastFareDetails(){
        return fareSettingsrepository.getLastFareDetails();
    }

}
