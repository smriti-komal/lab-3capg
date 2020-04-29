package com.example.lab1.productService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab1.product.Product;
import com.example.lab1.productDao.ProductDao;



@Service

public class ProductService {
	@Autowired
	ProductDao d;
	@Transactional
	public List<Product> product()
	{
		return (List<Product>) d.findAll();
	}
	
	@Transactional
	public boolean addproduct(Product p)
	{
		return d.save(p)!=null;
	}
   @Transactional
   public Product update(int id,Product product)
   {
	   return d.save(product) ;
   }
}
