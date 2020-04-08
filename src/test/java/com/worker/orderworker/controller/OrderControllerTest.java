package com.worker.orderworker.controller;

import com.worker.orderworker.entity.Product;
import com.worker.orderworker.entity.TypeSecurity;
import com.worker.orderworker.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderControllerTest {
    @Autowired
    private OrderService orderService;
    private String testName = "Samsung A50";
    private BigDecimal testPriceInsuranse = BigDecimal.valueOf(5000);

    @Test
    void getProduct() {
        Product product = orderService.getProduct(testName, testPriceInsuranse);
        assertEquals(TypeSecurity.INSURANCE, product.getTypeSecurity());
    }
}