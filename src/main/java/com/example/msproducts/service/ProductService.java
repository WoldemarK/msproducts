package com.example.msproducts.service;

import com.example.msproducts.model.Product;
import com.example.msproducts.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements Iproduct {

    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product prd) {
        return productRepository.save(prd);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }
}
