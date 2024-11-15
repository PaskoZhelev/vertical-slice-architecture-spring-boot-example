package com.mnp.verticalslicesspring.features.customer.create;

import com.mnp.verticalslicesspring.shared.entity.CustomerEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CreateCustomerController {

    private final CreateCustomerHandler createCustomerHandler;

    public CreateCustomerController(CreateCustomerHandler createCustomerHandler) {
        this.createCustomerHandler = createCustomerHandler;
    }

    @PostMapping("/customers")
    public ResponseEntity<CustomerEntity> createCustomer(@RequestBody CreateCustomerCommand command) {
        CustomerEntity customer = createCustomerHandler.handle(command);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }
}
