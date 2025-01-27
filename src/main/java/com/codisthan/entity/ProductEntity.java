package com.codisthan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Author: Codisthan
 * Created By: Tara Ram
 * Date: 27-01-2025
 * Time: 10:00
 * Project Name: Record-DTO
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductEntity {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
}
