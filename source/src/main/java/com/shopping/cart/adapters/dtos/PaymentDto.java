package com.shopping.cart.adapters.dtos;

import com.shopping.cart.adapters.dtos.enums.FormPaymentDto;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PaymentDto {
    private UUID identifier;
    private FormPaymentDto formPayment;
    private CardDto card;

    public PaymentDto() {
    }

    public PaymentDto(UUID identifier, FormPaymentDto formPayment, CardDto card) {
        this.identifier = identifier;
        this.formPayment = formPayment;
        this.card = card;
    }
}
