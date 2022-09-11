package com.genspark.productapi.model.product;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private int price;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
