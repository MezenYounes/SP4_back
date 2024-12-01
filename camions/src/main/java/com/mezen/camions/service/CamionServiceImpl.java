package com.mezen.camions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mezen.camions.entities.Camion;
import com.mezen.camions.entities.Marque;
import com.mezen.camions.repos.CamionRepository;
@Service
public class CamionServiceImpl implements CamionService {
	
	@Autowired
	CamionRepository camionRepository;


	@Override
	public Camion saveCamion(Camion c) {
		return camionRepository.save(c);
	}

	@Override
	public Camion updateCamion(Camion c) {
		return camionRepository.save(c);
	}

	@Override
	public void deleteCamion(Camion c) {
		camionRepository.delete(c);
		
	}

	@Override
	public void deleteCamionById(Long id) {
		camionRepository.deleteById(id);
		
	}

	@Override
	public Camion getCamion(Long id) {
		return camionRepository.findById(id).get();
	}

	@Override
	public List<Camion> getAllCamions() {
		return camionRepository.findAll();
	}

	@Override
	public List<Camion> findBynomcamion(String nom) {
		
		return camionRepository.findBynomcamion(nom);
	}

	@Override
	public List<Camion> findBynomcamionContains(String nom) {
		return camionRepository.findBynomcamionContains(nom);
	}

	@Override
	public List<Camion> findByNomPrix(String nom, Double prix) {
		return camionRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Camion> findByMarque(Marque marque) {
		return camionRepository.findByMarque(marque);
	}

	@Override
	public List<Camion> findByMarqueIdmar(Long id) {
		return camionRepository.findByMarqueIdmar(id);
	}

	@Override
	public List<Camion> findByOrderByNomcamionAsc() {
		return camionRepository.findByOrderByNomcamionAsc();
	}

	@Override
	public List<Camion> trierCamionsNomsPrix() {
		return camionRepository.trierCamionsNomsPrix();
	}

}
