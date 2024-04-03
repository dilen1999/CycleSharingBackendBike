package com.example.CycleSharingSystemBackend.model;


import jakarta.persistence.*;

@Entity

@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bike_id;
    private String first_name;
    private  String last_name;
    private String email;
    private long mobile_number;

    public long getBike_id() {
        return bike_id;
    }

    public void setBike_id(long bike_id) {
        this.bike_id = bike_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(long mobile_number) {
        this.mobile_number = mobile_number;
    }
}
