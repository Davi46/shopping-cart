package com.shopping.cart.application;

import com.shopping.cart.domain.adapters.IPurchaseWriteAdapter;
import com.shopping.cart.domain.entities.Purchase;
import com.shopping.cart.domain.services.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Component
@Qualifier("PurchaseService")
public class PurchaseService implements IPurchaseService {

    @Autowired
    //@Qualifier("PurchaseWriteAdapter")
    IPurchaseWriteAdapter _iPurchaseWriteAdapter;

    @Override
    public UUID add(Purchase purchase) {
        return _iPurchaseWriteAdapter.save(purchase);
    }
}
