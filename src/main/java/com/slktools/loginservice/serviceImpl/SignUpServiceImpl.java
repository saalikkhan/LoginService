package com.slktools.loginservice.serviceImpl;

import java.time.ZonedDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slktools.loginservice.dto.UserDTO;
import com.slktools.loginservice.entities.User;
import com.slktools.loginservice.repository.UserInfoRepository;
import com.slktools.loginservice.services.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private UserInfoRepository repository;

	@Override
	public void saveUser(UserDTO user) {
		User userEntity = new User();
		System.out.println("Inside saveUser()");
		prepareUserEntityObject(user);
		BeanUtils.copyProperties(user, userEntity);
		System.out.println(user);
		System.out.println(userEntity);
		repository.save(userEntity);
	}

	private UserDTO prepareUserEntityObject(UserDTO user) {
		user.setFullName(user.getFirstName().concat(" ").concat(user.getLastName()));
		user.setUniqueId(user.getFirstName() +"_"+ String.valueOf(user.getMobileNumber()));
		user.setCreationDate(ZonedDateTime.now());
		user.setStatus('A');
		return user;
	}

}
