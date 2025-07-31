package com.nicolasfonseca.Ecommerce.infrastructure.adapter;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nicolasfonseca.Ecommerce.application.repository.StockRepositry;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.Stock;
import com.nicolasfonseca.Ecommerce.infrastructure.mapper.ProductMapper;
import com.nicolasfonseca.Ecommerce.infrastructure.mapper.StockMapper;

@Service
public class StockRepositoryImpl implements StockRepositry{


    private final  StockCrudRepository stockCrudRepository;
    private final StockMapper stockMapper;
    private final ProductMapper productMapper;


    public StockRepositoryImpl(StockCrudRepository stockCrudRepository, StockMapper stockMapper,
            ProductMapper productMapper) {
        this.stockCrudRepository = stockCrudRepository;
        this.stockMapper = stockMapper;
        this.productMapper = productMapper;
    }



    @Override
    public Stock saveStock(Stock stock) {
        return stockMapper.toStock(stockCrudRepository.save(stockMapper.toStockEntity(stock)));
    }

    @Override
    public List<Stock> geStockByProduct(Product Product) {
        
        return stockMapper.toStock(stockCrudRepository.findByProductEntity(productMapper.toPorductEntity(Product)));
    }


    
}
