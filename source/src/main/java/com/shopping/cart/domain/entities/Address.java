package com.shopping.cart.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
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
}
