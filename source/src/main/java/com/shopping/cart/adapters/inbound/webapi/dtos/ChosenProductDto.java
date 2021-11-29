package com.shopping.cart.adapters.inbound.webapi.dtos;


import java.util.UUID;

public class ChosenProductDto {
    private UUID identifier;
    private ProductDto product;
    private int amount;

    public ChosenProductDto() {
    }

    public ChosenProductDto(ProductDto product, int amount) {
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

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
