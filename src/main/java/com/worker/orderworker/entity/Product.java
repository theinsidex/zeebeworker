package com.worker.orderworker.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Product {
    private String name;
    private BigDecimal price;
    private TypeSecurity typeSecurity;
}
