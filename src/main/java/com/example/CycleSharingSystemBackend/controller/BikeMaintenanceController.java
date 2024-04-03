package com.example.CycleSharingSystemBackend.controller;



import com.example.BikeManagementService.model.BikeMaintenance;
import com.example.BikeManagementService.service.BikeMaintenanceService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1/bikeMaintenance"})
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