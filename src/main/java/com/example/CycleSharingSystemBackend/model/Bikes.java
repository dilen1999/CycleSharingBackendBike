package com.example.CycleSharingSystemBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name= "Bikes")
public class Bikes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Bike_id;
    private String brand;
    private String bikeModel;
    private Long bike_code;
    private Date last_maintenance_date;
    private String color;

//    private String onRide;
//    private String currentLocation;
//    private ByteArrayResource QR_code;

    @Transient
    private String formattedMaintenanceDate; // Transient field to hold formatted date


//    @OneToMany(mappedBy = "bikes", cascade = CascadeType.ALL)
//    private List<BikeMaintenance> maintenancesRecords;


//    @Transient
//    private String qrCodeValue; // New field for storing QR code value
//    public Bikes(Long bike_id, String brand, String bikeModel, Long bike_code) {
//        this.Bike_id = bike_id;
//        this.brand = brand;
//        this.bikeModel = bikeModel;
//        this.bike_code = bike_code;
//    }


//    @ManyToOne
//    @JoinColumn(name = "Station_name")
//    private Station station;

//    @ManyToOne
//    @JoinColumn(name="Station_name")
//
//    private Station station;
    public String getFormattedMaintenanceDate() {
        // Format the last maintenance date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        formattedMaintenanceDate = sdf.format(last_maintenance_date);
        return formattedMaintenanceDate;
    }



}
