package com.mnp.verticalslicesspring.shared.mapper;

import com.mnp.verticalslicesspring.shared.dto.ProductDTO;
import com.mnp.verticalslicesspring.shared.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public static ProductDTO toDTO(ProductEntity product) {
        return new ProductDTO(product.getId(), product.getName());
    }

    public static List<ProductDTO> toDTO(List<ProductEntity> products) {
        return products.stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static ProductEntity toEntity(ProductDTO productDTO) {
        return new ProductEntity(productDTO.getName());
    }
}

