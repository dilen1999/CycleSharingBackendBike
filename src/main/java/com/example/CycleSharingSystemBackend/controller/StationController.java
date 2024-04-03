package com.example.CycleSharingSystemBackend.controller;

import com.example.CycleSharingSystemBackend.model.Station;
import com.example.CycleSharingSystemBackend.repository.Stationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class StationController {
    @Autowired
    private Stationrepository stationrepository;

    @PostMapping("/Station")
    public Station newStation (@RequestBody Station newStation){return (stationrepository.save(newStation));}

    @GetMapping("/Station")
    List<Station> getAllStation(){return stationrepository.findAll();}

    @DeleteMapping("/Station/{id}")
    public ResponseEntity<?> deleteStation(@PathVariable String id){
        return stationrepository.findById(id)
                .map(station -> {
                    stationrepository.delete(station);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
