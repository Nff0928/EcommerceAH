package com.nicolasfonseca.Ecommerce.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nicolasfonseca.Ecommerce.application.repository.ProductRepository;
import com.nicolasfonseca.Ecommerce.application.repository.StockRepositry;
import com.nicolasfonseca.Ecommerce.application.service.ProductService;
import com.nicolasfonseca.Ecommerce.application.service.StockService;
import com.nicolasfonseca.Ecommerce.application.service.UploadFile;

@Configuration
public class BeanConfiguration {
    
    @Bean
    public ProductService productService(ProductRepository productRepository, UploadFile uploadFile){
        return new ProductService(productRepository, uploadFile);
    }


    @Bean
    public UploadFile uploadFile(){
        return new UploadFile();
    }

    @Bean
    public StockService stockService(StockRepositry StockRepositry){
        return new StockService((StockRepositry));
    }

}
