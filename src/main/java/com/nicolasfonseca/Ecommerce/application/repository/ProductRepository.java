package com.nicolasfonseca.Ecommerce.application.repository;

import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.User;

public interface ProductRepository {
    Iterable<Product> getProducts();
    Iterable<Product> getProductsByUser(User user);
    Product geProductById(Integer id);
    Product saveProduct(Product product);
    void deleteProductId(Integer id);
    


}
