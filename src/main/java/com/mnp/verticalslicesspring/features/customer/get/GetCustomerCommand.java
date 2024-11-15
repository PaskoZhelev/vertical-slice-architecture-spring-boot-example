package com.mnp.verticalslicesspring.features.customer.get;

public class GetCustomerCommand {
    private Long customerId;

    public GetCustomerCommand(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}

