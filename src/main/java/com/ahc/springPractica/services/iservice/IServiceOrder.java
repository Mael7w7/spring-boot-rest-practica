package com.ahc.springPractica.services.iservice;

import com.ahc.springPractica.entities.Order;
import com.ahc.springPractica.entities.Product;


import java.util.List;

public interface IServiceOrder {
    List<Order> listOrder(); //listar ordenes
    Order findOrderById(Long id); //obtener order por id
    Order createOrder(Order order); //crear order
    Order updateOrder( Long id ,Order order);//actualizar order por id
    void deleteOrder(Long id);
    List<Order> listOrderByCustomerId(Long customerId);
    List<Order> listProductByOrderId(Long productId);
}
