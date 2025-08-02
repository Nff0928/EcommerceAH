package com.nicolasfonseca.Ecommerce.application.service;

import java.util.List;

import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.Stock;

public class ValidateStock {

    private final StockService stockService;

    public ValidateStock(StockService stockService) {
        this.stockService = stockService;
    }


    private boolean existBalance(Product product){
        List<Stock> stockList = stockService.getStockByProduct(product);

        return stockList.isEmpty() ? false : true;
    }

    public Stock calculateBalance(Stock stock){
        if(stock.getUnitIn() != 0 ){
            if(existBalance(stock.getProduct())){
                List<Stock> stockList = stockService.getStockByProduct(stock.getProduct());
                Integer balance = stockList.get(stockList.size() -1).getBalance();
                stock.setBalance(balance + stock.getUnitIn());
            }else{
                stock.setBalance(stock.getUnitIn());
            }

        }else{
            List<Stock> stockList = stockService.getStockByProduct(stock.getProduct());
            Integer balance = stockList.get(stockList.size() -1).getBalance();
            stock.setBalance(balance - stock.getUnitOut());
        }
        return stock;
    }
    
}
