package com.leduyminh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leduyminh.entity.CategoryEntity;

//@Repository trong Class IMPL
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	
}