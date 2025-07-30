package com.nicolasfonseca.Ecommerce.domain;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.ToString;


@Data
@ToString

public class Stock {

    private Integer  id, unitIn, unitOut, balance;
    private String  description;
    private LocalDateTime  dateRegister;
    private Product product;






    
}
