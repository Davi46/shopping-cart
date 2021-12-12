package com.shopping.cart.adapters.inbound.webapi.controllers;

import com.shopping.cart.adapters.dtos.PurchasePost;
import com.shopping.cart.domain.entities.Purchase;
import com.shopping.cart.domain.services.IPurchaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
    @Autowired
    @Qualifier("PurchaseService")
    IPurchaseService _purchaseService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(value = "/save")
    public UUID save(@RequestBody PurchasePost purchasePost) {
        Purchase purchase = modelMapper.map(purchasePost, Purchase.class);

        return _purchaseService.add(purchase);
    }

    @GetMapping
    public String teste() {
        return "OK";
    }
}