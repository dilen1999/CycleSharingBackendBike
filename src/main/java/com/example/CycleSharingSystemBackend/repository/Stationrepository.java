package com.example.CycleSharingSystemBackend.repository;

import com.example.CycleSharingSystemBackend.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Stationrepository extends JpaRepository<Station, String> {

}
