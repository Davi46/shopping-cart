package com.shopping.cart.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class Product {
    private UUID identifier;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.identifier = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }
}
