package com.shopping.cart.adapters.inbound.webapi.dtos;

import java.util.List;
import java.util.UUID;

public class PurchasePost {
    private UUID identifier;
    private ClientDto client;
    private double  discount;
    private List<ChosenProductDto> chosenProducts;
    private PaymentDto payment;

    public PurchasePost(Client client, double discount, List<ChosenProduct> chosenProducts, Payment payment) {
        this.identifier = UUID.randomUUID();
        this.client = client;
        this.discount = discount;
        this.chosenProducts = chosenProducts;
        this.payment = payment;
    }

    public PurchasePost() {
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
