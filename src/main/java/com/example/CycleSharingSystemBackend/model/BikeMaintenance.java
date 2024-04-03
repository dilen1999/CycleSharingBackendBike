package com.example.CycleSharingSystemBackend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class BikeMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-increment strategy
    private Long maintenanceId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_bike_id")
    private Bikes bikeId;

    private Date date;
    private String type;
    private boolean status;
    private String comments;

    public BikeMaintenance() {
    }

    public BikeMaintenance(Long maintenanceId, Bikes bike, Date date, String type, boolean status, String comments) {
        this.maintenanceId = maintenanceId;

        this.bikeId = bikeId;

        this.date = date;
        this.type = type;
        this.status = status;
        this.comments = comments;
    }


}