package com.demo.ecommerce.controller.dto;

public record OrderItemDto(Integer quantity,
                           Long productId) {
}
