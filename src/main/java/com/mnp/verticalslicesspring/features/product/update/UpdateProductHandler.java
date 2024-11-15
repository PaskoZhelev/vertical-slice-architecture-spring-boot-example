package com.mnp.verticalslicesspring.features.product.update;

import com.mnp.verticalslicesspring.shared.dto.ProductDTO;
import com.mnp.verticalslicesspring.shared.entity.ProductEntity;
import com.mnp.verticalslicesspring.shared.mapper.ProductMapper;
import com.mnp.verticalslicesspring.shared.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateProductHandler {

    private final ProductRepository productRepository;

    @Autowired
    public UpdateProductHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDTO handle(UpdateProductCommand command) {
        ProductEntity productEntity = productRepository.findById(command.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        productEntity.setName(command.getNewName());
        productEntity = productRepository.save(productEntity);

        return ProductMapper.toDTO(productEntity);
    }
}

