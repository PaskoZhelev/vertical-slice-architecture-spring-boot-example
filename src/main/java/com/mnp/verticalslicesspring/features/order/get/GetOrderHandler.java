package com.mnp.verticalslicesspring.features.order.get;

import com.mnp.verticalslicesspring.shared.Handler;
import com.mnp.verticalslicesspring.shared.dto.OrderDTO;
import com.mnp.verticalslicesspring.shared.entity.OrderEntity;
import com.mnp.verticalslicesspring.shared.mapper.OrderMapper;
import com.mnp.verticalslicesspring.shared.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetOrderHandler implements Handler<GetOrderCommand, OrderDTO> {

    private final OrderRepository orderRepository;

    @Autowired
    public GetOrderHandler(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDTO handle(GetOrderCommand command) {
        OrderEntity orderEntity = orderRepository.findById(command.getOrderId())
                .orElseThrow(() -> new RuntimeException("Order not found"));

        return OrderMapper.toDTO(orderEntity);
    }
}

