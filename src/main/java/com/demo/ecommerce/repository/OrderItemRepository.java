package com.demo.ecommerce.repository;

import com.demo.ecommerce.entities.OrderItemEntity;
import com.demo.ecommerce.entities.OrderItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, OrderItemId> {
}
