 package com.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long >{

}
