package com.shopping.cart.application;

import com.shopping.cart.domain.adapters.IPurchaseWriteAdapter;
import com.shopping.cart.domain.entities.Purchase;
import com.shopping.cart.domain.services.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class PurchaseService implements IPurchaseService {

    @Autowired
    IPurchaseWriteAdapter _iPurchaseWriteAdapter;

    @Override
    public UUID add(Purchase purchase) {
        return _iPurchaseWriteAdapter.save(purchase);
    }
}
