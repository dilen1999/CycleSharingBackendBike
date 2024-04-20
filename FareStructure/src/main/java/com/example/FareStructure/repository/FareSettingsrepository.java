package com.example.FareStructure.repository;

import com.example.FareStructure.model.FareSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FareSettingsrepository extends JpaRepository<FareSettings,Long> {
    @Query(value = "SELECT b FROM FareSettings b WHERE b.Fare_Id = (SELECT MAX(b2.Fare_Id) FROM FareSettings b2)")
    FareSettings getLastFareDetails();

}
