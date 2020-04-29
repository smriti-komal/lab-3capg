package com.example.lab1.productDao;



import org.springframework.data.repository.CrudRepository;

import com.example.lab1.product.Product;


public interface ProductDao extends CrudRepository<Product, Integer> {

}
