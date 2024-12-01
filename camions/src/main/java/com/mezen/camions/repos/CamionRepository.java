package com.mezen.camions.repos;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mezen.camions.entities.Camion;
import com.mezen.camions.entities.Marque;
@RepositoryRestResource(path = "rest")
public interface CamionRepository extends JpaRepository<Camion, Long> {
	List<Camion> findBynomcamion(String nom);
	List<Camion> findBynomcamionContains(String nom); 
	@Query("select c from Camion c where c.nomcamion like %?1 and c.prixcamion > ?2")
	List<Camion> findByNomPrix (String nom, Double prix);
	@Query("select c from Camion c where c.marque = ?1")
	List<Camion> findByMarque (Marque marque);
	
	List<Camion> findByMarqueIdmar(Long id);
	
	List<Camion> findByOrderByNomcamionAsc();
	@Query("select c from Camion c order by c.nomcamion ASC, c.prixcamion DESC")
	List<Camion> trierCamionsNomsPrix ();


	

}
