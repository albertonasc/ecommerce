package com.demo.ecommerce.repository;

import com.demo.ecommerce.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Long> {
}
