package com.example.CycleSharingSystemBackend.repository;

import com.example.CycleSharingSystemBackend.model.Bikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Bikerepository extends JpaRepository<Bikes, Long> {
    @Query("SELECT MAX(b.Bike_id) FROM Bikes b")
    Long findLatestBikeId();

    @Query(value = "SELECT b FROM Bikes b WHERE b.Bike_id = (SELECT MAX(b2.Bike_id) FROM Bikes b2)")
    Bikes findLatestBikeDetails();
}
