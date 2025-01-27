package com.codisthan.model;

import lombok.Builder;

/**
 * Author: Codisthan
 * Created By: Tara Ram
 * Date: 27-01-2025
 * Time: 10:02
 * Project Name: Record-DTO
 */
@Builder
public record ProductDTO(int id, String name, String description, double price, int quantity) {
}
