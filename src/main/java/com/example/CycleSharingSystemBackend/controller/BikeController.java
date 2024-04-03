package com.example.CycleSharingSystemBackend.controller;

import com.example.CycleSharingSystemBackend.exception.BikeNotFoundException;
import com.example.CycleSharingSystemBackend.model.Bikes;
import com.example.CycleSharingSystemBackend.model.ResultDTO;
import com.example.CycleSharingSystemBackend.repository.Bikerepository;
import com.example.CycleSharingSystemBackend.service.QRServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class BikeController {
    @Autowired
    private Bikerepository bikerepository;

//    @Autowired
//    private QRServicelmpl qrService;

//    @PostMapping("/Bikes")
//    public Bikes newBike(@RequestBody Bikes newBike) {
//        Bikes savedBike = bikerepository.save(newBike);
//
//        // Generate QR code for the new bike
//        ResultDTO resultDTO = qrService.processQR(savedBike);
//        // Set the QR code value for the saved bike
//        savedBike.setQrCodeValue(resultDTO.getQrValue());
//
//        return savedBike;
//    }

    @PostMapping("/Bikes")
    Bikes newBikes(@RequestBody Bikes newBikes){
        return bikerepository.save(newBikes);
    }



    @GetMapping("/Bikes")
    List<Bikes> getAllBikes() {
        return bikerepository.findAll();
    }


    @GetMapping("/Bikes/{Bike_id}")
    Bikes getBikeById(@PathVariable Long Bike_id) {
        return bikerepository.findById(Bike_id)
                .orElseThrow(() -> new BikeNotFoundException(Bike_id));
    }

    @PutMapping("/Bikes/{bike_id}")
    public Bikes updateBike(@RequestBody Bikes newBike, @PathVariable Long bike_id) {
        return bikerepository.findById(bike_id)
                .map(existingBike -> {
                    existingBike.setBike_code(newBike.getBike_code());
                    existingBike.setBikeModel(newBike.getBikeModel());
                    existingBike.setBrand(newBike.getBrand());
                    existingBike.setColor(newBike.getColor());
                    existingBike.setLast_maintenance_date(newBike.getLast_maintenance_date());
                    return bikerepository.save(existingBike); // return the updated bike
                })
                .orElseThrow(() -> new RuntimeException("Bike not found with id: " + bike_id));
    }

    @DeleteMapping("/Bikes/{bike_id}")
    String deleteBike(@PathVariable Long bike_id) {
        if (!bikerepository.existsById(bike_id)) {
            throw new BikeNotFoundException(bike_id);
        }
        bikerepository.deleteById(bike_id);
        return "Bike with id " + bike_id + " has been deleted successfully.";
    }

    @GetMapping("/Bikes/latestBikeId")
    public Long getLatestBikeId() {
        return bikerepository.findLatestBikeId();
    }

    @GetMapping("/Bikes/total")
    public int getTotalBikes() {
        List<Bikes> allBikes = bikerepository.findAll();
        return allBikes.size();
    }

    @GetMapping("/Bikes/latestBikeDetails")
    public Bikes getLatestBikeDetails() {
        return bikerepository.findLatestBikeDetails();
    }

}
