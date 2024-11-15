package com.mnp.verticalslicesspring.features.product.create;

import com.mnp.verticalslicesspring.shared.entity.ProductEntity;
import com.mnp.verticalslicesspring.shared.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateProductHandler {

    private final ProductRepository productRepository;

    public CreateProductHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductEntity handle(CreateProductCommand command) {
        ProductEntity product = new ProductEntity();
        product.setName(command.getName());
        return productRepository.save(product);
    }
}
