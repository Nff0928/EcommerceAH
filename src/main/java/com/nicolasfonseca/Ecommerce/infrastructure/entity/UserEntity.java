package com.nicolasfonseca.Ecommerce.infrastructure.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.usertype.UserType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username, firstName, lastName, email, address, cellphone, password;
    
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private LocalDateTime dateCreated;
    
    

}
