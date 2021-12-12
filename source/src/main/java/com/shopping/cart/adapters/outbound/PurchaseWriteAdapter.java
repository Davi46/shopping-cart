package com.shopping.cart.adapters.outbound;

import com.shopping.cart.domain.adapters.IPurchaseWriteAdapter;
import com.shopping.cart.domain.entities.Purchase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Qualifier("PurchaseWriteAdapter")
public class PurchaseWriteAdapter implements IPurchaseWriteAdapter {

    @Override
    public UUID save(Purchase purchase) {
        return UUID.randomUUID();
    }
}