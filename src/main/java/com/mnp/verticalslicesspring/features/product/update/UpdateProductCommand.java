package com.mnp.verticalslicesspring.features.product.update;

public class UpdateProductCommand {
    private Long productId;
    private String newName;

    public UpdateProductCommand(Long productId, String newName) {
        this.productId = productId;
        this.newName = newName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }
}

