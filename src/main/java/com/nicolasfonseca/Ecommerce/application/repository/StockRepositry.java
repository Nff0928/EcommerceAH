package com.nicolasfonseca.Ecommerce.application.repository;

import java.util.List;

import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.Stock;

public interface StockRepositry {

    Stock saveStock(Stock stock);
        List<Stock> geStockByProduct(Product Product);

    
    
}
