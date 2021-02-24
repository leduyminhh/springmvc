package com.leduyminh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leduyminh.entity.UserEntity;

//@Repository trong Class IMPL
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUserNameAndStatus(String name, int status);
}