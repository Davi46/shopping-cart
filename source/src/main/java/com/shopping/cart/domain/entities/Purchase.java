package com.shopping.cart.domain.entities;

import java.util.List;
import java.util.UUID;

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

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<ChosenProduct> getChosenProducts() {
        return chosenProducts;
    }

    public void setChosenProducts(List<ChosenProduct> chosenProducts) {
        this.chosenProducts = chosenProducts;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
