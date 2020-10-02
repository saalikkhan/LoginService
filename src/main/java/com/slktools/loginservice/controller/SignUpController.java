package com.slktools.loginservice.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slktools.loginservice.dto.UserDTO;
import com.slktools.loginservice.serviceImpl.SignUpServiceImpl;

@RestController
public class SignUpController {
	
	@Autowired
	private SignUpServiceImpl signUpService;
	
	@PostMapping(path = "/signUp")
	public ResponseEntity<String> saveNewUser(@RequestBody @Valid UserDTO user) {
		try {
			System.out.println(user);
			signUpService.saveUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).build();
		}
		return ResponseEntity.of(Optional.of("Successfuly Signed up .... " + user.getFirstName() + " (Username :- " + user.getUserName() + ")"));
	}
	
}
