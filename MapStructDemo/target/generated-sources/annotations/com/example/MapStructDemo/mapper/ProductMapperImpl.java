package com.example.MapStructDemo.mapper;

import com.example.MapStructDemo.dto.ProductDto;
import com.example.MapStructDemo.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-04T17:09:10+0530",
    comments = "version: 1.5.0.Beta1, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( product.getId() );
        productDto.setName( product.getName() );
        productDto.setPrice( product.getPrice() );
        productDto.setQuantity( product.getQuantity() );

        return productDto;
    }

    @Override
    public Product productDtoToProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDto.getId() );
        product.setName( productDto.getName() );
        product.setPrice( productDto.getPrice() );
        product.setQuantity( productDto.getQuantity() );

        return product;
    }

    @Override
    public List<ProductDto> toDtos(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            list.add( toDto( product ) );
        }

        return list;
    }
}
