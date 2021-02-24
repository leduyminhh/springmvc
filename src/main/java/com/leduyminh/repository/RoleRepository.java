package com.leduyminh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leduyminh.entity.RoleEntity;

//@Repository trong Class IMPL
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	
}