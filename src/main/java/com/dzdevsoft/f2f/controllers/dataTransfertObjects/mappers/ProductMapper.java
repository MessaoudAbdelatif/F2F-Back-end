package com.dzdevsoft.f2f.controllers.dataTransfertObjects.mappers;

import com.dzdevsoft.f2f.controllers.dataTransfertObjects.models.ProductDto;
import com.dzdevsoft.f2f.entities.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {

  Product toProduct(ProductDto productDto);

  ProductDto toProductDto(Product product);
}
