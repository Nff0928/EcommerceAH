package com.nicolasfonseca.Ecommerce.infrastructure.adapter;

import org.springframework.stereotype.Repository;

import com.nicolasfonseca.Ecommerce.application.repository.ProductRepository;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.User;
import com.nicolasfonseca.Ecommerce.infrastructure.mapper.ProductMapper;
import com.nicolasfonseca.Ecommerce.infrastructure.mapper.UserMapper;

@Repository
public class ProductRepositoryImpl implements ProductRepository{


    private final ProductCrudRepository productCrudRepository;
    private final  ProductMapper productMapper;
    private final UserMapper userMapper;


    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository, ProductMapper productMapper, UserMapper userMapper){
        this.productCrudRepository = productCrudRepository;
        this.productMapper = productMapper;
        this.userMapper = userMapper;

    }

    @Override
    public Iterable<Product> getProducts() {
        
        return productMapper.toPorducts(productCrudRepository.findAll());
    }

    @Override
    public Iterable<Product> getProductsByUser(User user) {
        
        return productMapper.toPorducts(productCrudRepository.findByUserEntity(userMapper.toUserEntity(user)));
    }

    @Override
    public Product geProductById(Integer id) {
        
        return productMapper.toProduct(productCrudRepository.findById(id).get());
    }

    @Override
    public Product saveProduct(Product product) {
        
        return productMapper.toProduct(productCrudRepository.save(productMapper.toPorductEntity(product)));
    }

    @Override
    public void deleteProductId(Integer id) {
        
        productCrudRepository.deleteById(id);;
    }
    
}
