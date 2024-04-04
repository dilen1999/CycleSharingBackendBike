package com.example.CycleSharingSystemBackend.service;



import java.util.List;
import java.util.Optional;

//import com.example.CycleSharingSystemBackend.dto.BikeMaintenanceDTO;
import com.example.CycleSharingSystemBackend.model.BikeMaintenance;
import com.example.CycleSharingSystemBackend.repository.BikeMaintenanceRepository;
import org.springframework.stereotype.Service;

@Service
public class BikeMaintenanceService {
    private final BikeMaintenanceRepository bikeMaintenanceRepository;

    public BikeMaintenanceService(BikeMaintenanceRepository bikeMaintenanceRepository) {
        this.bikeMaintenanceRepository = bikeMaintenanceRepository;
    }

    public void createBikeMaintenance(BikeMaintenance bikeMaintenance) {
        this.bikeMaintenanceRepository.save(bikeMaintenance);
    }

    public boolean updateBikeMaintenance(BikeMaintenance maintenance, Long maintenanceId) {
        Optional<BikeMaintenance> existingMaintenanceOptional = this.bikeMaintenanceRepository.findById(maintenanceId);
        if (existingMaintenanceOptional.isPresent()) {
            BikeMaintenance existingMaintenance = (BikeMaintenance)existingMaintenanceOptional.get();
            existingMaintenance.setDate(maintenance.getDate());
            existingMaintenance.setType(maintenance.getType());
            existingMaintenance.setStatus(maintenance.isStatus());
            existingMaintenance.setComments(maintenance.getComments());
            this.bikeMaintenanceRepository.save(existingMaintenance);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteBikeMaintenanceRecord(Long maintenanceId) {
        Optional<BikeMaintenance> existingMaintenanceOptional = this.bikeMaintenanceRepository.findById(maintenanceId);
        if (existingMaintenanceOptional.isPresent()) {
            this.bikeMaintenanceRepository.deleteById(maintenanceId);
            return true;
        } else {
            return false;
        }
    }

    public List<BikeMaintenance> getAllBikeMaintenance() {
        return this.bikeMaintenanceRepository.findAll();
    }

//    private BikeMaintenanceDTO convertToDTO(BikeMaintenance maintenance) {
//        BikeMaintenanceDTO dto = new BikeMaintenanceDTO();
//        dto.setMaintenanceId(maintenance.getMaintenanceId());
//        dto.setBikeId(maintenance.getBike_id().getBike_id());
//        dto.setDate(maintenance.getDate());
//        dto.setType(maintenance.getType());
//        dto.setStatus(maintenance.isStatus());
//        dto.setComments(maintenance.getComments());
//        return dto;
//    }
}
