package com.ahc.springPractica.services.serviceImpl;

import com.ahc.springPractica.entities.Order;

import com.ahc.springPractica.repositories.OrderRespository;
import com.ahc.springPractica.services.iservice.IServiceOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
@Builder
public class OrderService implements IServiceOrder {
    private final OrderRespository orderRespository;

    @Override
    public List<Order> listOrder() {
        return orderRespository.findAll();
    }

    @Override
    public Order findOrderById(Long id) {
        return orderRespository.findById(id).orElse(null);
    }

    @Override
    public Order createOrder(Order order) {
        return orderRespository.save(order);
    }


    @Override
    public Order updateOrder(Long id, Order order) {
        order.setId(id);
        return orderRespository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRespository.deleteById(id);
    }

    @Override
    public List<Order> listOrderByCustomerId(Long customerId) {
        return orderRespository.findByCustomerId(customerId);
    }

    @Override
    public List<Order> listProductByOrderId(Long productId) {
        return orderRespository.findByProducts_Id(productId);
    }

}
