package com.example.FareStructure.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Fare setting")
public class FareSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Fare_Id;
    private double minimumFare;
    private double hourlyRate;
    private double dailyRate;
    private double weeklyRate;
    private double monthlyRate;

}
