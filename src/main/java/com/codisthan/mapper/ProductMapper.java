package com.codisthan.mapper;

import com.codisthan.entity.ProductEntity;
import com.codisthan.model.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Author: Codisthan
 * Created By: Tara Ram
 * Date: 27-01-2025
 * Time: 10:03
 * Project Name: Record-DTO
 */
@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDto(ProductEntity entity);

    ProductEntity toEntity(ProductDTO dto);
}
