package com.mnp.verticalslicesspring.features.product.get;

public class GetProductCommand {
    private Long productId;

    public GetProductCommand(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}

