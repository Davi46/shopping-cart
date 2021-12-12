package com.shopping.cart.adapters.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class PurchasePost {
    private UUID identifier;
    private ClientDto client;
    private double  discount;
    private List<ChosenProductDto> chosenProducts;
    private PaymentDto payment;

    public PurchasePost(ClientDto client, double discount, List<ChosenProductDto> chosenProducts, PaymentDto payment) {
        this.identifier = UUID.randomUUID();
        this.client = client;
        this.discount = discount;
        this.chosenProducts = chosenProducts;
        this.payment = payment;
    }

    public PurchasePost() {
    }
}
