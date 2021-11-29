package com.shopping.cart.domain.entities;

import java.util.UUID;

public class Address {
    private UUID identifier;
    private String street;
    private String district;
    private int zipCode;
    private String state;
    private String country;

    public Address() {
    }

    public Address(String street, String district, int zipCode, String state, String country) {
        this.identifier = UUID.randomUUID();
        this.street = street;
        this.district = district;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
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
}
