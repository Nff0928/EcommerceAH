package com.nicolasfonseca.Ecommerce.application.service;



import com.nicolasfonseca.Ecommerce.application.repository.ProductRepository;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.User;



public class ProductService {
    
    private final ProductRepository productRepository;
    
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Iterable<Product> getProduct(){
        return productRepository.getProducts();
    }

    public Iterable<Product> getProductByUser(User user){
        return productRepository.getProductsByUser(user);
    }

    public Product geProductById(Integer id){
        return productRepository.geProductById(id);
    }

    public Product saveProduct(Product product){
        return productRepository.saveProduct(product);
    }

    public void deleteProductId(Integer Id){
        productRepository.deleteProductId(Id);
    }


}
