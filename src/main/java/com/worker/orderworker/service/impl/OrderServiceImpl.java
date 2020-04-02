package com.worker.orderworker.service.impl;

import com.worker.orderworker.entity.Product;
import com.worker.orderworker.entity.TypeSecurity;
import com.worker.orderworker.service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {
    private final static BigDecimal BOUND_PRICE = BigDecimal.valueOf(3000);

    @Override
    public Product getProduct(String name, BigDecimal price) {
        TypeSecurity typeSecurity;
        if (price.compareTo(BOUND_PRICE) == 1) {
            typeSecurity = TypeSecurity.INSURANCE;
        } else typeSecurity = TypeSecurity.WARRANTY;

        return Product.builder()
                .name(name)
                .price(price)
                .typeSecurity(typeSecurity)
                .build();
    }

}
