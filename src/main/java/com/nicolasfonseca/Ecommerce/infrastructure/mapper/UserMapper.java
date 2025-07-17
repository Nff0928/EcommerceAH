package com.nicolasfonseca.Ecommerce.infrastructure.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.nicolasfonseca.Ecommerce.domain.User;
import com.nicolasfonseca.Ecommerce.infrastructure.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings(
        {
            @Mapping(source = "id", target = "id"),
                @Mapping(source = "username", target = "firstName"),
                @Mapping(source = "name", target = "name"),
                @Mapping(source = "lastName", target = "lastName"),
                @Mapping(source = "email", target = "email"),
                @Mapping(source = "address", target = "address"),
                @Mapping(source = "cellphone", target = "cellphone"),
                @Mapping(source = "password", target = "password"),
                @Mapping(source = "dateCreated", target = "dateCreated"),
        }
    )
    


    User toUser(UserEntity userEntity);
    Iterable<User> toUsers(Iterable<UserEntity> UserEntity);


    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);



}
