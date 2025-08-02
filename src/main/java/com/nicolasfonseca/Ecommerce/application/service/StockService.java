package com.nicolasfonseca.Ecommerce.application.service;

import java.util.List;

import com.nicolasfonseca.Ecommerce.application.repository.StockRepository;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.Stock;

public class StockService {


    private final StockRepository stockRepository;  

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock saveStock(Stock stock){
        return stockRepository.saveStock(stock);
    }

    
    public List<Stock> getStockByProduct(Product product){
        return stockRepository.geStockByProduct(product);
    }

    


    
}
