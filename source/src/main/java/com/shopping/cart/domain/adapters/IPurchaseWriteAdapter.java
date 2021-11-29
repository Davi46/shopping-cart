package com.shopping.cart.domain.adapters;

import com.shopping.cart.domain.entities.Purchase;

import java.util.UUID;

public interface IPurchaseWriteAdapter {
    UUID save(Purchase purchase);
}
