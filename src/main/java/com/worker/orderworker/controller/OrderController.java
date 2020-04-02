package com.worker.orderworker.controller;

import com.worker.orderworker.entity.Product;
import com.worker.orderworker.exception.ParameterNotFoundException;
import com.worker.orderworker.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/rest")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @RequestMapping(method = RequestMethod.GET,
                    produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product getType(@RequestParam("name") String name,
                           @RequestParam("price") BigDecimal price) {
        if(name == null || price == null){
            throw new ParameterNotFoundException("Parameter price not found");
        }
        return orderService.getProduct(name,price);
    }

}
