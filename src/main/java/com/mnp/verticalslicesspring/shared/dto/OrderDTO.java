package com.mnp.verticalslicesspring.shared.dto;

import java.util.Set;

public class OrderDTO {
    private Long id;
    private Set<ProductDTO> products;
    private CustomerDTO customer;

    // Constructors, Getters, and Setters
    public OrderDTO(Long id, Set<ProductDTO> products, CustomerDTO customer) {
        this.id = id;
        this.products = products;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductDTO> products) {
        this.products = products;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
}
