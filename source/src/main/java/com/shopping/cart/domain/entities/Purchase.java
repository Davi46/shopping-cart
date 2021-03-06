package com.shopping.cart.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Purchase {
    private UUID identifier;
    private Client client;
    private double  discount;
    private List<ChosenProduct> chosenProducts;
    private Payment payment;

    public Purchase(Client client, double discount, List<ChosenProduct> chosenProducts, Payment payment) {
        this.identifier = UUID.randomUUID();
        this.client = client;
        this.discount = discount;
        this.chosenProducts = chosenProducts;
        this.payment = payment;
    }

    public Purchase() {
    }
}
