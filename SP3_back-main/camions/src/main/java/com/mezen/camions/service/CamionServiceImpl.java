package com.mezen.camions.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mezen.camions.entities.Camion;
import com.mezen.camions.entities.Marque;
import com.mezen.camions.repos.CamionRepository;
import com.mezen.camions.repos.ImageRepository;
@Service
public class CamionServiceImpl implements CamionService {
	
	@Autowired
	CamionRepository camionRepository;
	@Autowired
	ImageRepository imageRepository;


	@Override
	public Camion saveCamion(Camion c) {
		return camionRepository.save(c);
	}

	@Override
	public Camion updateCamion(Camion c) {
		//Long oldCamImageId =
			//	this.getCamion(c.getidcamion()).getimage().getIdImage();
				//Long newCamImageId = c.getimage().getIdImage();

		Camion camUpdated = camionRepository.save(c);
		//if (oldCamImageId != newCamImageId) //si l'image a été modifiée
			//imageRepository.deleteById(oldCamImageId);
			return camUpdated;
	}

	@Override
	public void deleteCamion(Camion c) {
		camionRepository.delete(c);
		
	}

	@Override
	public void deleteCamionById(Long id) {
		Camion c = getCamion(id);
		 //suuprimer l'image avant de supprimer le produit
		try {
		Files.delete(Paths.get(System.getProperty("user.home")+"/images/"+c.getImagePath()));
		} catch (IOException e) {
		e.printStackTrace();
		}
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
