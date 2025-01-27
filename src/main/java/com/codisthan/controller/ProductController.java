package com.codisthan.controller;

import com.codisthan.entity.ProductEntity;
import com.codisthan.mapper.ProductMapper;
import com.codisthan.model.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Codisthan
 * Created By: Tara Ram
 * Date: 27-01-2025
 * Time: 10:07
 * Project Name: Record-DTO
 */

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @PostMapping
    public ResponseEntity<ProductDTO> getProduct(@RequestBody ProductDTO dto) {
        ProductEntity entity = ProductMapper.INSTANCE.toEntity(dto);
       log.info("Converted into Entity: {}",entity);
        ProductDTO response = ProductMapper.INSTANCE.toDto(entity);
        log.info("Converted into dto: {}",response);
        return null;
    }
}
