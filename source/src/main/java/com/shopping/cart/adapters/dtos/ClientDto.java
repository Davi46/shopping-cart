package com.shopping.cart.adapters.dtos;

import com.shopping.cart.domain.entities.Address;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ClientDto {
    private UUID identifier;
    private String firstName;
    private String lastName;
    private Address address;
    private String socialSecurityNumber;

    public ClientDto() {
    }

    public ClientDto(String firstName, String lastName, Address address, String socialSecurityNumber) {
        this.identifier = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
