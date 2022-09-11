package com.genspark.productapi.service.product;

import com.genspark.productapi.dao.product.ProductDao;
import com.genspark.productapi.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Optional<Product> getProductById(Long productId) {
        if(productId == null) {
            throw new IllegalArgumentException("Product ID must not be null");
        }
        return productDao.findById(productId);
    }

    @Override
    public void addProduct(Product product) {
        if(product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        productDao.save(product);
    }
}
