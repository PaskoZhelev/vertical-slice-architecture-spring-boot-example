package com.mnp.verticalslicesspring.features.customer.update;

public class UpdateCustomerCommand {
    private Long customerId;
    private String newName;
    private String newEmail;

    public UpdateCustomerCommand(Long customerId, String newName, String newEmail) {
        this.customerId = customerId;
        this.newName = newName;
        this.newEmail = newEmail;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }
}

