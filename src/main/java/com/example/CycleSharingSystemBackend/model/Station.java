package com.example.CycleSharingSystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Data
@Getter
@Setter

@Entity
@Table(name="Station")
public class Station {
    @Id
    private String Station_name;
    private String Location;
    private Integer Total_bikes;
    private Integer Capacity;
//    @OneToMany(mappedBy = "station")
//    private List<Bikes> bikes;

//    @OneToMany(mappedBy="Bikes")
//    private Set<Bikes> bikes;


}
