package com.leduyminh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.leduyminh.constant.SystemConstant;
import com.leduyminh.dto.MyUser;
import com.leduyminh.entity.RoleEntity;
import com.leduyminh.entity.UserEntity;
import com.leduyminh.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	//Authentication
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findOneByUserNameAndStatus(username,SystemConstant.ACTIVE_STATUS);
		if(userEntity==null)
		{
			throw new UsernameNotFoundException("User not found");
		}
		
		//Put role vao GrantedAuthority
		List<GrantedAuthority> authorities = new ArrayList<>();
		for(RoleEntity role : userEntity.getRoles())
		{
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		
		//Put thong tin len security duy tri khi user dang nhap vao het thong
		MyUser user = new MyUser(userEntity.getUserName(), userEntity.getPassWord(), true, true, true, true, authorities);
		user.setFullName(userEntity.getFullName());
		
		return user;
	}

}
