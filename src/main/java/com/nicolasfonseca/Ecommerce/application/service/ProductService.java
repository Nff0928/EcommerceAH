package com.nicolasfonseca.Ecommerce.application.service;



import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import com.nicolasfonseca.Ecommerce.application.repository.ProductRepository;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.User;



public class ProductService {
    
    private final ProductRepository productRepository;
    private final UploadFile uploadFile;



    public ProductService(ProductRepository productRepository, UploadFile uploadFile){
        this.productRepository = productRepository;
        this.uploadFile = uploadFile;
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

    public Product saveProduct(Product product, MultipartFile multipartFile)throws IOException{
        if(product.getId()== null){
            User user = new User();
            user.setId(1);
            product.setDateCreated(LocalDateTime.now());
            product.setDateUpdate(LocalDateTime.now());
            product.setUser(user);
            product.setImage(uploadFile.upload(multipartFile));
            return productRepository.saveProduct(product);

        }else{
            Product productDB = productRepository.geProductById(product.getId());
            // SI NO SE CARGA LA IMAGEN TOMA LA QUE SE LE GUARDO AL REGISTRO
            if(multipartFile.isEmpty()){
                product.setImage(productDB.getImage());
            }else{//GUARDA LA QUE SE LE ENVIA ACTUALMENTE
                if(!productDB.getImage().equals("default.jpg")){
                    uploadFile.delete(productDB.getImage());
                }
                product.setImage(uploadFile.upload(multipartFile));
            }
            product.setCode(productDB.getCode());
            product.setUser(productDB.getUser());
            product.setDateCreated(productDB.getDateCreated());
            product.setDateUpdate(LocalDateTime.now());
            return productRepository.saveProduct(product);
        }
        
    }

    public void deleteProductById(Integer id){
        productRepository.deleteProductById(id);
    }


}
