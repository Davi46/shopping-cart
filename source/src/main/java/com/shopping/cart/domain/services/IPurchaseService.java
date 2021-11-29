package com.shopping.cart.domain.services;

import com.shopping.cart.domain.entities.Purchase;

import java.util.UUID;

public interface IPurchaseService {
    UUID add(Purchase purchase);
}
