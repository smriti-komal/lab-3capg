package com.example.lab1.productController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab1.product.Product;
import com.example.lab1.productService.ProductService;



@RestController
public class ProductController {

	@Autowired
	 ProductService s;
	 @RequestMapping (value="/product", method= RequestMethod.GET)
     public List<Product> getAllProduct()
     {
     return s.product();
     }
	
	@RequestMapping (value="/addproduct", method= RequestMethod.PUT)
	public HttpStatus insert(@RequestBody Product p)
	{
		return s.addproduct(p)?
		HttpStatus.CREATED:HttpStatus.BAD_REQUEST;			
	}
	@RequestMapping (value="/update/{id}", method= RequestMethod.PUT)
	public Product update(@RequestBody Product p, @PathVariable int id)
	{
		return s.update(id, p);
	}

}

