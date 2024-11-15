package com.mnp.verticalslicesspring.shared.mapper;

import com.mnp.verticalslicesspring.shared.dto.CustomerDTO;
import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;

public class CustomerMapper {

    public static CustomerDTO toDTO(CustomerEntity customer) {
        return new CustomerDTO(customer.getId(), customer.getName(), customer.getEmail());
    }

    public static CustomerEntity toEntity(CustomerDTO customerDTO) {
        return new CustomerEntity(customerDTO.getName(), customerDTO.getEmail());
    }
}

