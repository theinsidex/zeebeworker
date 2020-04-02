package com.worker.orderworker.service;

import com.worker.orderworker.entity.Product;

import java.math.BigDecimal;

public interface OrderService {
    Product getProduct(String name, BigDecimal price);
}
