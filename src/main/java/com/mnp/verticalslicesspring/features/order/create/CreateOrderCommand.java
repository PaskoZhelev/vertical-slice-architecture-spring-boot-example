package com.mnp.verticalslicesspring.features.order.create;

import java.util.Set;

public class CreateOrderCommand {
    private Long customerId;
    private Set<Long> productIds;

    public CreateOrderCommand(Long customerId, Set<Long> productIds) {
        this.customerId = customerId;
        this.productIds = productIds;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Set<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(Set<Long> productIds) {
        this.productIds = productIds;
    }
}

