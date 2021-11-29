package com.shopping.cart.domain.entities;

import java.util.UUID;

public class Product {
    private UUID identifier;
    private String name;

    public Product() {
    }

    public Product(String name, double price) {
        this.identifier = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
}
