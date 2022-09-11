package com.genspark.productapi.dao.product;

import com.genspark.productapi.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}
