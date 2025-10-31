package com.ahc.springPractica.controller;

import com.ahc.springPractica.entities.Customer;
import com.ahc.springPractica.services.serviceImpl.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;


    @GetMapping
    public List<Customer> findAll() {
        return customerService.listCustomer();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id,@RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }

}
