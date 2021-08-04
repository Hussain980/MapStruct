package com.example.MapStructDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MapStructDemo.dto.ProductDto;
import com.example.MapStructDemo.entity.Product;
import com.example.MapStructDemo.mapper.ProductMapper;
import com.example.MapStructDemo.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private ProductRepository productRepo;
	
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody ProductDto productDto){
		return new ResponseEntity<>(productRepo.save(
                productMapper.productDtoToProduct(productDto)), HttpStatus.CREATED);
				
	}
	
	@GetMapping("/products")
    public ResponseEntity<List<ProductDto>> findAll() {
        return new ResponseEntity<>(productMapper.toDtos(
        		productRepo.findAll()), HttpStatus.OK);
    }
}
