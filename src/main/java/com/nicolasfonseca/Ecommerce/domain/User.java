package com.nicolasfonseca.Ecommerce.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username, firsName, lastName, email, address, cellphone, password;
    private Integer id;
    private UserType userType;
    private LocalDateTime dateCreated;
    
}
