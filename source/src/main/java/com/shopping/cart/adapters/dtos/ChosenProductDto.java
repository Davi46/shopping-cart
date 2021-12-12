package com.shopping.cart.adapters.dtos;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
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
}
