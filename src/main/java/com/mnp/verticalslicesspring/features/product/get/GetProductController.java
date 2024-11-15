package com.mnp.verticalslicesspring.features.product.get;

import com.mnp.verticalslicesspring.shared.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GetProductController {

    private final GetProductHandler getProductHandler;

    @Autowired
    public GetProductController(GetProductHandler getProductHandler) {
        this.getProductHandler = getProductHandler;
    }

    @GetMapping("/products/{id}")
    public ProductDTO getProduct(@PathVariable Long id) {
        return getProductHandler.handle(new GetProductCommand(id));
    }
}
