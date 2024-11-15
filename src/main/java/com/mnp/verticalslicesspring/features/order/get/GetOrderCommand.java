package com.mnp.verticalslicesspring.features.order.get;

public class GetOrderCommand {
    private Long orderId;

    // Constructor
    public GetOrderCommand(Long orderId) {
        this.orderId = orderId;
    }

    // Getter
    public Long getOrderId() {
        return orderId;
    }

    // Setter
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}

