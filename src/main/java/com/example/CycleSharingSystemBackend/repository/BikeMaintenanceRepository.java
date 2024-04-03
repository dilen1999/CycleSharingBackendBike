package com.example.CycleSharingSystemBackend.repository;


import com.example.CycleSharingSystemBackend.model.BikeMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeMaintenanceRepository extends JpaRepository<BikeMaintenance,Long> {

}
