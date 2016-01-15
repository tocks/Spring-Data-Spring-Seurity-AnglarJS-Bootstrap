package com.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entities.Role;

public interface RoleRepository extends JpaRepository<Role,String> {

}
