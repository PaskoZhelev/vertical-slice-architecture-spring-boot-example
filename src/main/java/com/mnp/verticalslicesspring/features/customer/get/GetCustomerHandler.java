package com.mnp.verticalslicesspring.features.customer.get;

import com.mnp.verticalslicesspring.shared.dto.CustomerDTO;
import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;
import com.mnp.verticalslicesspring.shared.mapper.CustomerMapper;
import com.mnp.verticalslicesspring.shared.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetCustomerHandler {

    private final CustomerRepository customerRepository;

    @Autowired
    public GetCustomerHandler(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO handle(GetCustomerCommand command) {
        CustomerEntity customerEntity = customerRepository.findById(command.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        return CustomerMapper.toDTO(customerEntity);
    }
}

