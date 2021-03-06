package com.shopping.cart.domain.entities;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class Client {
    private UUID identifier;
    private String firstName;
    private String lastName;
    private Address address;
    private String socialSecurityNumber;

    public Client() {
    }

    public Client(String firstName, String lastName, Address address) {
        this.identifier = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}