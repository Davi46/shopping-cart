package com.shopping.cart.domain.entities;

import com.shopping.cart.domain.entities.enums.FormPayment;

import java.util.UUID;

public class Payment {
    private UUID identifier;
    private FormPayment formPayment;
    private Card card;

    public Payment() {
    }

    public Payment(UUID identifier, FormPayment formPayment, Card card) {
        this.identifier = identifier;
        this.formPayment = formPayment;
        this.card = card;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public FormPayment getFormPayment() {
        return formPayment;
    }

    public void setFormPayment(FormPayment formPayment) {
        this.formPayment = formPayment;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
