package com.ahc.springPractica.services.serviceImpl;

import com.ahc.springPractica.entities.Customer;
import com.ahc.springPractica.repositories.CustomerRepository;
import com.ahc.springPractica.services.iservice.IServiceCustomer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
@Builder
public class CustomerService  implements IServiceCustomer {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> listCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer (Long id ,Customer customer) {

        customer.setId(id);
        return customerRepository.save(customer);

    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }


}
