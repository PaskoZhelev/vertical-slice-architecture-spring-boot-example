package com.mnp.verticalslicesspring.features.customer.get;

import com.mnp.verticalslicesspring.shared.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class GetCustomerController {

    private final GetCustomerHandler getCustomerHandler;

    @Autowired
    public GetCustomerController(GetCustomerHandler getCustomerHandler) {
        this.getCustomerHandler = getCustomerHandler;
    }

    @GetMapping("/customers/{id}")
    public CustomerDTO getCustomer(@PathVariable Long id) {
        return getCustomerHandler.handle(new GetCustomerCommand(id));
    }
}
