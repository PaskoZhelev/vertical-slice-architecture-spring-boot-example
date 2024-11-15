package com.mnp.verticalslicesspring.features.product.update;

import com.mnp.verticalslicesspring.shared.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UpdateProductController {

    private final UpdateProductHandler updateProductHandler;

    @Autowired
    public UpdateProductController(UpdateProductHandler updateProductHandler) {
        this.updateProductHandler = updateProductHandler;
    }

    @PutMapping("/products/{id}")
    public ProductDTO updateProduct(@PathVariable Long id, @RequestBody UpdateProductCommand command) {
        command.setProductId(id);
        return updateProductHandler.handle(command);
    }
}
