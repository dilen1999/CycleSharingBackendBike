package com.example.CycleSharingSystemBackend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
public class BikeMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-increment strategy
    private Long maintenanceId;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="fk_bike_id")
    private Long Bike_id;

    private Date date;
    private String type;
    private boolean status;
    private String comments;


    @Transient
    private String formattedMaintenanceDate1; // Transient field to hold formatted date

    public BikeMaintenance() {
    }

    public BikeMaintenance(Long maintenanceId, Bikes bikes, Date date, String type, boolean status, String comments) {
        this.maintenanceId = maintenanceId;

        this.Bike_id = Bike_id;

        this.date = date;
        this.type = type;
        this.status = status;
        this.comments = comments;
    }

    public String getFormattedMaintenanceDate1() {
        // Format the last maintenance date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        formattedMaintenanceDate1 = sdf.format(date);
        return formattedMaintenanceDate1;
    }


}
