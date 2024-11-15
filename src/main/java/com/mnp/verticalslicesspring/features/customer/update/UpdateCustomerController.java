package com.mnp.verticalslicesspring.features.customer.update;

import com.mnp.verticalslicesspring.shared.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UpdateCustomerController {

    private final UpdateCustomerHandler updateCustomerHandler;

    @Autowired
    public UpdateCustomerController(UpdateCustomerHandler updateCustomerHandler) {
        this.updateCustomerHandler = updateCustomerHandler;
    }

    @PutMapping("/customers/{id}")
    public CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody UpdateCustomerCommand command) {
        command.setCustomerId(id);
        return updateCustomerHandler.handle(command);
    }
}
