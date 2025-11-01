package com.ahc.springPractica.controller;

import com.ahc.springPractica.entities.Order;
import com.ahc.springPractica.services.serviceImpl.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrdersController {
    private OrderService orderService;

    @GetMapping
    public List<Order> getOrders() {
        return orderService.listOrder();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderService.findOrderById(id);
    }

    @PostMapping
    public  Order addOrder (@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        order.setId(id);
        return orderService.createOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }


}
