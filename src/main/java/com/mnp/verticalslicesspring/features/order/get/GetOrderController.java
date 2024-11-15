package com.mnp.verticalslicesspring.features.order.get;

import com.mnp.verticalslicesspring.shared.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetOrderController {

    private final GetOrderHandler getOrderHandler;

    @Autowired
    public GetOrderController(GetOrderHandler getOrderHandler) {
        this.getOrderHandler = getOrderHandler;
    }

    @GetMapping("/orders/{id}")
    public OrderDTO getOrder(@PathVariable Long id) {
        // Create the command and pass it to the handler
        GetOrderCommand command = new GetOrderCommand(id);
        return getOrderHandler.handle(command);
    }
}
