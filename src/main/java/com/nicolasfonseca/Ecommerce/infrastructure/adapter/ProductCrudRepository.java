package com.nicolasfonseca.Ecommerce.infrastructure.adapter;

import org.springframework.data.repository.CrudRepository;


import com.nicolasfonseca.Ecommerce.infrastructure.entity.ProductEntity;
import com.nicolasfonseca.Ecommerce.infrastructure.entity.UserEntity;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer>{
    

    Iterable<ProductEntity> findByUserEntity(UserEntity userEntity);

    
}
