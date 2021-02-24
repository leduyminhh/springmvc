package com.leduyminh.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.leduyminh.dto.NewDTO;

public interface INewService {
	public List<NewDTO> findAll(Pageable pageable);
	int getTotalItem();
}
