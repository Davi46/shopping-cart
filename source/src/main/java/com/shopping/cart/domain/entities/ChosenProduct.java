package com.shopping.cart.domain.entities;

import java.util.UUID;

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

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
