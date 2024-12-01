package com.mezen.camions.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mezen.camions.entities.Marque;


public interface MarqueRepository extends JpaRepository<Marque, Long>{
	

}
