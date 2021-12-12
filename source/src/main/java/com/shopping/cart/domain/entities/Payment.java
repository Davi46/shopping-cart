package com.shopping.cart.domain.entities;

import com.shopping.cart.domain.entities.enums.FormPayment;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
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
}
