package com.nicolasfonseca.Ecommerce.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;



@Data
@AllArgsConstructor
@ToString
public class Product {
    
    private Integer id;
    private String  code, name, description, image;
    private BigDecimal price;
    private LocalDateTime dateCreated, dateUpdate;
    private User user;
    
    
    public Product(){
        this.setCode(UUID.randomUUID().toString()); //Identificador unico de de ID
    }
}
