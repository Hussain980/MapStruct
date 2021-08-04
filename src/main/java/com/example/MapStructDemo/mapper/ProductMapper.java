package com.example.MapStructDemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.MapStructDemo.dto.ProductDto;
import com.example.MapStructDemo.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	ProductDto toDto(final Product product);

	Product productDtoToProduct(final ProductDto productDto);
	
	List<ProductDto> toDtos(final List<Product> products);

}
