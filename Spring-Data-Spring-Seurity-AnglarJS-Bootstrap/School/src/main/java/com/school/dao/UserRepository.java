package com.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entities.User;

public interface UserRepository  extends JpaRepository<User	, String>{

}
