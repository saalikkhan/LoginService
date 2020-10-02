package com.slktools.loginservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.slktools.loginservice.entities.User;

@Repository
public interface UserInfoRepository extends CrudRepository<User , String> {

}
