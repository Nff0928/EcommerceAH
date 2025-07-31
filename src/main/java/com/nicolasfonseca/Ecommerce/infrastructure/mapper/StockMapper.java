package com.nicolasfonseca.Ecommerce.infrastructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.nicolasfonseca.Ecommerce.domain.Stock;
import com.nicolasfonseca.Ecommerce.infrastructure.entity.ProductEntity;
import com.nicolasfonseca.Ecommerce.infrastructure.entity.StockEntity;

@Mapper(componentModel = "string", uses = {ProductMapper.class})
public interface StockMapper {

    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "dateCreated", target = "dateCreated"),
        @Mapping(source = "unitIn", target = "unitIn"),
        @Mapping(source = "unitOut", target = "unitOut"),
        @Mapping(source = "description", target = "description"),
        @Mapping(source = "balance", target = "balance"),
        @Mapping(source = "productEntity", target = "product"),
    }

    )


    Stock toStock(StockEntity stockEntity);
    List<Stock> toStock(List<StockEntity> StockEntities);
    @InheritInverseConfiguration
    StockEntity toStockEntity(Stock stock);
    
}
