package com.shopping.cart.adapters.inbound.webapi.dtos;

import com.shopping.cart.domain.entities.Address;

import java.util.UUID;

public class ClientDto {
    private UUID identifier;
    private String firstName;
    private String lastName;
    private Address address;
    private String socialSecurityNumber;

    public ClientDto() {
    }

    public ClientDto(String firstName, String lastName, Address address) {
        this.identifier = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
