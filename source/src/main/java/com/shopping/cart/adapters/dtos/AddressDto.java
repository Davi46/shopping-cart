package com.shopping.cart.adapters.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AddressDto {
    private UUID identifier;
    private String street;
    private String district;
    private int zipCode;
    private String state;
    private String country;

    public AddressDto() {
    }

    public AddressDto(String street, String district, int zipCode, String state, String country) {
        this.identifier = UUID.randomUUID();
        this.street = street;
        this.district = district;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }
}
