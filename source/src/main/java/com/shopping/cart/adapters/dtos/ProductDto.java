package com.shopping.cart.adapters.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductDto {
    private UUID identifier;
    private String name;
    private double price;

    public ProductDto() {
    }

    public ProductDto(String name, double price) {
        this.identifier = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }
}
