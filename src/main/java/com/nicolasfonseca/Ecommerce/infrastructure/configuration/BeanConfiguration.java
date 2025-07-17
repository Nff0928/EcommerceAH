package com.nicolasfonseca.Ecommerce.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nicolasfonseca.Ecommerce.application.repository.ProductRepository;
import com.nicolasfonseca.Ecommerce.application.service.ProductService;

@Configuration
public class BeanConfiguration {
    
    @Bean
    public ProductService productService(ProductRepository productRepository){
        return new ProductService(productRepository);

    }
}
