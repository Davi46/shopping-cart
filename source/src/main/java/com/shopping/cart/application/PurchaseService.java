package com.shopping.cart.application;

import com.shopping.cart.domain.adapters.IPurchaseWriteAdapter;
import com.shopping.cart.domain.entities.Purchase;
import com.shopping.cart.domain.services.IPurchaseService;

import java.util.UUID;

public class PurchaseService implements IPurchaseService {

    private IPurchaseWriteAdapter _iPurchaseWriteAdapter;

    public PurchaseService(IPurchaseWriteAdapter iPurchaseWriteAdapter) {
        this._iPurchaseWriteAdapter = iPurchaseWriteAdapter;
    }

    @Override
    public UUID add(Purchase purchase) {
        return _iPurchaseWriteAdapter.save(purchase);
    }
}
