package com.example.CycleSharingSystemBackend.controller;

import java.util.List;

import com.example.CycleSharingSystemBackend.model.BikeMaintenance;
import com.example.CycleSharingSystemBackend.service.BikeMaintenanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping({"/Bikes/bikeMaintenance"})
public class BikeMaintenanceController {
    private final BikeMaintenanceService bikeMaintenanceService;

    public BikeMaintenanceController(BikeMaintenanceService bikeMaintenanceService) {
        this.bikeMaintenanceService = bikeMaintenanceService;
    }

    @GetMapping({"/all"})
    public ResponseEntity<List<BikeMaintenance>> getAllBikeMaintenance() {
        List<BikeMaintenance> allMaintenance = this.bikeMaintenanceService.getAllBikeMaintenance();
        return new ResponseEntity(allMaintenance, HttpStatus.OK);
    }

    @PostMapping({"/create"})
    public ResponseEntity<String> createBikeMaintenance(@RequestBody BikeMaintenance bikeMaintenance) {
        this.bikeMaintenanceService.createBikeMaintenance(bikeMaintenance);
        return new ResponseEntity("Bike Maintenance created successfully", HttpStatus.CREATED);
    }

    @PutMapping({"/update/{maintenanceId}"})
    public ResponseEntity<String> updateBikeMaintenance(@RequestBody BikeMaintenance bikeMaintenance, @PathVariable Long bikeId) {
        boolean updated = this.bikeMaintenanceService.updateBikeMaintenance(bikeMaintenance, bikeId);
        return updated ? new ResponseEntity("Bike Maintenance updated successfully", HttpStatus.OK) : new ResponseEntity("Bike Maintenance not found", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping({"/delete/{maintenanceId}"})
    public ResponseEntity<String> deleteBikeMaintenance(@PathVariable Long maintenanceId) {
        boolean updated = this.bikeMaintenanceService.deleteBikeMaintenanceRecord(maintenanceId);
        return updated ? new ResponseEntity("Bike Maintenance Record deleted successfully", HttpStatus.OK) : new ResponseEntity("Bike Maintenance Record not found", HttpStatus.NOT_FOUND);
    }
}
