package com.leduyminh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leduyminh.entity.NewEntity;

//@Repository trong Class IMPL
public interface NewRepository extends JpaRepository<NewEntity, Long> {
}