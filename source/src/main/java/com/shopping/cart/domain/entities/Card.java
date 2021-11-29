package com.shopping.cart.domain.entities;

import java.util.UUID;

public class Card {
    private UUID identifier;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String number;
    private String dueDate;
    private int codeSecurity;

    public Card() {
    }

    public Card(String firstName, String lastName, String socialSecurityNumber, String number, String dueDate, int codeSecurity) {
        this.identifier = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.number = number;
        this.dueDate = dueDate;
        this.codeSecurity = codeSecurity;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getCodeSecurity() {
        return codeSecurity;
    }

    public void setCodeSecurity(int codeSecurity) {
        this.codeSecurity = codeSecurity;
    }
}
