package com.nicolasfonseca.Ecommerce.infrastructure.adapter;

import org.springframework.data.repository.CrudRepository;


import com.nicolasfonseca.Ecommerce.infrastructure.entity.ProductEntity;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer>{
    
    
}
