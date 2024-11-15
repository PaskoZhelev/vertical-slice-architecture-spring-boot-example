package com.mnp.verticalslicesspring.shared.dto;

public class ProductDTO {
    private Long id;
    private String name;

    // Constructors, Getters, and Setters
    public ProductDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

