package com.mnp.verticalslicesspring.features.order.create;

import com.mnp.verticalslicesspring.shared.Handler;
import com.mnp.verticalslicesspring.shared.dto.OrderDTO;
import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;
import com.mnp.verticalslicesspring.shared.entity.OrderEntity;
import com.mnp.verticalslicesspring.shared.entity.ProductEntity;
import com.mnp.verticalslicesspring.shared.mapper.OrderMapper;
import com.mnp.verticalslicesspring.shared.repository.CustomerRepository;
import com.mnp.verticalslicesspring.shared.repository.OrderRepository;
import com.mnp.verticalslicesspring.shared.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateOrderHandler implements Handler<CreateOrderCommand, OrderDTO> {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public CreateOrderHandler(OrderRepository orderRepository,
                                     ProductRepository productRepository,
                                     CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
    }

    public OrderDTO handle(CreateOrderCommand command) {
        CustomerEntity customer = customerRepository.findById(command.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        List<ProductEntity> products = productRepository.findAllById(command.getProductIds());

        OrderEntity order = new OrderEntity(products, customer);
        order = orderRepository.save(order);

        return OrderMapper.toDTO(order);
    }
}
