package com.shopping.cart.adapters.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CardDto {
    private UUID identifier;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String number;
    private String dueDate;
    private int codeSecurity;

    public CardDto() {
    }

    public CardDto(String firstName, String lastName, String socialSecurityNumber, String number, String dueDate, int codeSecurity) {
        this.identifier = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.number = number;
        this.dueDate = dueDate;
        this.codeSecurity = codeSecurity;
    }
}
