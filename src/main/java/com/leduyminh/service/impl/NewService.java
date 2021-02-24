package com.leduyminh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.leduyminh.dto.NewDTO;
import com.leduyminh.entity.NewEntity;
import com.leduyminh.repository.NewRepository;
import com.leduyminh.service.INewService;

@Service
public class NewService implements INewService{

	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<NewDTO> findAll(Pageable pageable) {
		List<NewEntity> entities = newRepository.findAll(pageable).getContent();
		List<NewDTO> models = new ArrayList<>();
		for(NewEntity item : entities) {
			
			models.add(modelMapper.map(item,NewDTO.class));
		}
		return models;
	}

	@Override
	public int getTotalItem() {
		return (int) newRepository.count();
	}
	

}
