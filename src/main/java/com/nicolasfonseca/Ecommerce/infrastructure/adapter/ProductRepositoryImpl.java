package com.nicolasfonseca.Ecommerce.infrastructure.adapter;

import org.springframework.stereotype.Repository;

import com.nicolasfonseca.Ecommerce.application.repository.ProductRepository;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.User;

@Repository
public class ProductRepositoryImpl implements ProductRepository{


    private final ProductCrudRepository productCrudRepository;
    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository){
        this.productCrudRepository = productCrudRepository;
    }

    @Override
    public Iterable<Product> getProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProducts'");
    }

    @Override
    public Iterable<Product> getProductsByUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByUser'");
    }

    @Override
    public Product geProductById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'geProductById'");
    }

    @Override
    public Product saveProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveProduct'");
    }

    @Override
    public void deleteProductId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProductId'");
    }
    
}
