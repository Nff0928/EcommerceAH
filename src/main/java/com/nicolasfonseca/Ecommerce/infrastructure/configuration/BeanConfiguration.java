package com.nicolasfonseca.Ecommerce.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nicolasfonseca.Ecommerce.application.repository.ProductRepository;

import com.nicolasfonseca.Ecommerce.application.service.ProductService;
import com.nicolasfonseca.Ecommerce.application.service.StockService;
import com.nicolasfonseca.Ecommerce.application.service.UploadFile;
import com.nicolasfonseca.Ecommerce.application.service.ValidateStock;
import com.nicolasfonseca.Ecommerce.infrastructure.adapter.StockRepositoryImpl;

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
    public StockService stockService(StockRepositoryImpl stockRepository){
        return new StockService(stockRepository);
    }
    @Bean
    public ValidateStock validateStock(StockService stockService){
        return new ValidateStock(stockService);
    }

}
