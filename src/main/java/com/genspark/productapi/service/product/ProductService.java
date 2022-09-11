package com.genspark.productapi.service.product;

import com.genspark.productapi.model.product.Product;
import java.util.Optional;

public interface ProductService {
    Optional<Product> getProductById(Long productId);
    void addProduct(Product product);
}
