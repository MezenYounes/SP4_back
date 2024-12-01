package com.mezen.camions.service;

import java.util.List;
import com.mezen.camions.entities.Camion;
import com.mezen.camions.entities.Marque;
public interface CamionService {
	Camion saveCamion(Camion c);
	Camion updateCamion(Camion c);
	void deleteCamion(Camion c);
	 void deleteCamionById(Long id);
	 Camion getCamion(Long id);
	List<Camion> getAllCamions();
	List<Camion> findBynomcamion(String nom);
	List<Camion> findBynomcamionContains(String nom); 
	List<Camion> findByNomPrix (String nom, Double prix);
	List<Camion> findByMarque (Marque marque);
	List<Camion> findByMarqueIdmar(Long id);
	List<Camion> findByOrderByNomcamionAsc();
	List<Camion> trierCamionsNomsPrix ();


}
