package com.example.msproducts.mapper;

import com.example.msproducts.dto.ProductDTO;
import com.example.msproducts.model.Product;

public class ProductMapper {

    public static Product DtoToEntity(ProductDTO prd) {
        return new Product().setName(prd.getName())
                .setPrice(prd.getPrice());
    }

    public static ProductDTO EntityToDto(Product prd) {
        return new ProductDTO().setName(prd.getName())
                .setPrice(prd.getPrice());
    }
}
