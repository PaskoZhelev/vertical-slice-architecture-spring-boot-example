package com.mnp.verticalslicesspring.features.customer.update;

import com.mnp.verticalslicesspring.shared.dto.CustomerDTO;
import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;
import com.mnp.verticalslicesspring.shared.mapper.CustomerMapper;
import com.mnp.verticalslicesspring.shared.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerHandler {

    private final CustomerRepository customerRepository;

    @Autowired
    public UpdateCustomerHandler(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO handle(UpdateCustomerCommand command) {
        CustomerEntity customerEntity = customerRepository.findById(command.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        customerEntity.setName(command.getNewName());
        customerEntity.setEmail(command.getNewEmail());
        customerEntity = customerRepository.save(customerEntity);

        return CustomerMapper.toDTO(customerEntity);
    }
}

