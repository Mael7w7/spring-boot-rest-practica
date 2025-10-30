package com.ahc.springPractica.services.iservice;

import com.ahc.springPractica.entities.Customer;

import java.util.List;

public interface IServiceCustomer {

    List<Customer> listCustomer() ;//Listar todo los clientes
    Customer findCustomerById(Long id);// obtener cliente por id;
    Customer createCustomer(Customer customer); //crear un cliente
    Customer updateCustomer(Long id , Customer customer);//actualiza un cliente por id
    void deleteCustomer(Long id);


}
