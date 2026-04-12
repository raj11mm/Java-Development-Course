package com.rajshekhar;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int addrid;
    @Column
    int streetno;
    @Column
    String streetname;
    @Column
    String city;
    @Column
    String state;
    @Column
    String country;
    @Column
    int pincode;

    public Address(int streetno, String streetname, String city, String state, String country, int pincode) {
        this.streetno = streetno;
        this.streetname = streetname;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public Address(int streetno, String streetname, String city, String state, String country, int pincode, int addrid) {
        this.streetno = streetno;
        this.streetname = streetname;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.addrid = addrid;
    }

    public int getAddrid() {
        return addrid;
    }

    public void setAddrid(int addrid) {
        this.addrid = addrid;
    }

    public int getStreetno() {
        return streetno;
    }

    public void setStreetno(int streetno) {
        this.streetno = streetno;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
