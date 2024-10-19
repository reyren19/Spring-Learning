package com.example.my_spring_app.service;

import com.example.my_spring_app.model.Product;
import com.example.my_spring_app.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private ProductDAO productDAO;

    // this does constructor injection of productDAO
    @Autowired
    public ProductService(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    public List<Product> getAllProducts(){
        return productDAO.findAll();
    }

    public Product addProduct(Product product){
        return productDAO.save(product);
    }
}
