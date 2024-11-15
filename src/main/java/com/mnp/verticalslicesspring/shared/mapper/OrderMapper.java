package com.mnp.verticalslicesspring.shared.mapper;

import com.mnp.verticalslicesspring.shared.dto.CustomerDTO;
import com.mnp.verticalslicesspring.shared.dto.OrderDTO;
import com.mnp.verticalslicesspring.shared.dto.ProductDTO;
import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;
import com.mnp.verticalslicesspring.shared.entity.OrderEntity;
import com.mnp.verticalslicesspring.shared.entity.ProductEntity;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderMapper {

    public static OrderDTO toDTO(OrderEntity order) {
        Set<ProductDTO> productDTOs = order.getProducts().stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toSet());
        CustomerDTO customerDTO = CustomerMapper.toDTO(order.getCustomer());

        return new OrderDTO(order.getId(), productDTOs, customerDTO);
    }

    public static List<OrderDTO> toDTO(List<OrderEntity> orders) {
        return orders.stream()
                .map(OrderMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static OrderEntity toEntity(OrderDTO orderDTO) {
        List<ProductEntity> products = orderDTO.getProducts().stream()
                .map(ProductMapper::toEntity)
                .collect(Collectors.toList());
        CustomerEntity customer = CustomerMapper.toEntity(orderDTO.getCustomer());

        return new OrderEntity(products, customer);
    }
}

