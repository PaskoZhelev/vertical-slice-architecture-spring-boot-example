package com.mnp.verticalslicesspring.features.product.get;

import com.mnp.verticalslicesspring.shared.dto.ProductDTO;
import com.mnp.verticalslicesspring.shared.entity.ProductEntity;
import com.mnp.verticalslicesspring.shared.mapper.ProductMapper;
import com.mnp.verticalslicesspring.shared.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetProductHandler {

    private final ProductRepository productRepository;

    @Autowired
    public GetProductHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDTO handle(GetProductCommand command) {
        ProductEntity productEntity = productRepository.findById(command.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));
        return ProductMapper.toDTO(productEntity);
    }
}

