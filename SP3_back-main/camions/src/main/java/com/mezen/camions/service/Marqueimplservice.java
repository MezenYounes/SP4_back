package com.mezen.camions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mezen.camions.entities.Marque;
import com.mezen.camions.repos.MarqueRepository;

@Service
public class Marqueimplservice implements MarqueService {
	@Autowired
	MarqueRepository marquerepository;

	@Override
	public Marque saveMarque(Marque marque) {
		
		return marquerepository.save(marque) ;
	}

}
