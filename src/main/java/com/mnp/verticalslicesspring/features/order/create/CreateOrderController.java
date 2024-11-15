package com.mnp.verticalslicesspring.features.order.create;

import com.mnp.verticalslicesspring.shared.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateOrderController {
    private final CreateOrderHandler createOrderCommandHandler;

    @Autowired
    public CreateOrderController(CreateOrderHandler createOrderCommandHandler) {
        this.createOrderCommandHandler = createOrderCommandHandler;
    }

    @PostMapping("/orders")
    public OrderDTO createOrder(@RequestBody CreateOrderCommand command) {
        return createOrderCommandHandler.handle(command);
    }
}
