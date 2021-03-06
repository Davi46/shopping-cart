package com.shopping.cart.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class ChosenProduct {
    private UUID identifier;
    private Product product;
    private int amount;

    public ChosenProduct() {
    }

    public ChosenProduct(Product product, int amount) {
        this.identifier = UUID.randomUUID();
        this.product = product;
        this.amount = amount;
    }
}
