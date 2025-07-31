package com.nicolasfonseca.Ecommerce.infrastructure.adapter;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nicolasfonseca.Ecommerce.infrastructure.entity.ProductEntity;
import com.nicolasfonseca.Ecommerce.infrastructure.entity.StockEntity;

public interface StockCrudRepository extends CrudRepository<StockEntity, Integer>{

    List<StockEntity> findByProductEntity(ProductEntity productEntity);
    



    
}
