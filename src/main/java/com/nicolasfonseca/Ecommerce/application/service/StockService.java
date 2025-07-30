package com.nicolasfonseca.Ecommerce.application.service;

import java.util.List;

import com.nicolasfonseca.Ecommerce.application.repository.StockRepositry;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.Stock;

public class StockService {


    private final StockRepositry stockRepositry;

    public StockService(StockRepositry stockRepositry) {
        this.stockRepositry = stockRepositry;
    }

    public Stock  saveStock(Stock stock){
        return stockRepositry.saveStock(stock);
    }


    public List<Stock> getStockByProduct(Product product){
        return stockRepositry.geStockByProduct(product);
    }
    


    
}
