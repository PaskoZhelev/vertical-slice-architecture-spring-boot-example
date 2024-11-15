package com.mnp.verticalslicesspring.features.product.create;

import com.mnp.verticalslicesspring.shared.entity.ProductEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CreateProductController {

    private final CreateProductHandler createProductHandler;

    public CreateProductController(CreateProductHandler createProductHandler) {
        this.createProductHandler = createProductHandler;
    }

    @PostMapping("/products")
    public ResponseEntity<ProductEntity> createProduct(@RequestBody CreateProductCommand command) {
        ProductEntity product = createProductHandler.handle(command);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}
