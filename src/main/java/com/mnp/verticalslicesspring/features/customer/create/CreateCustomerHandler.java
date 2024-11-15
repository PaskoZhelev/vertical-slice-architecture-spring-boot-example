package com.mnp.verticalslicesspring.features.customer.create;

import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;
import com.mnp.verticalslicesspring.shared.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerHandler {

    private final CustomerRepository customerRepository;

    public CreateCustomerHandler(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity handle(CreateCustomerCommand command) {
        CustomerEntity customer = new CustomerEntity();
        customer.setName(command.getName());
        customer.setEmail(command.getEmail());
        return customerRepository.save(customer);
    }
}


