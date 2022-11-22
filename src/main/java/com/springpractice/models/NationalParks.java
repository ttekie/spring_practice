package com.springpractice.models;

import javax.persistence.*;

@Entity
@Table(name="national_park")
public class NationalParks {
    @Id
    // this annotation will tell jpa that it will auto generate the primary key id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length=200)
    private String name;
    @Column(nullable = false, length=100)
    private String address;

    @Column(nullable = false, length=50)
    private String city;

    @Column(nullable = false, length=35)
    private String state;

    @Column(nullable = false, length=5)
    private String zipcode;

    @Column(nullable = false, length=100)
    private String phoneNumber;

    public NationalParks() {
    }

    public NationalParks(String name, String address, String city, String state, String zipcode, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
