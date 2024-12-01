package com.mezen.camions;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mezen.camions.entities.Camion;
import com.mezen.camions.entities.Marque;
import com.mezen.camions.repos.CamionRepository;

@SpringBootTest
class CamionsApplicationTests {

	
		@Autowired
		private CamionRepository camionRepository;
		@Test
		public void testCreateCamion() {
		Camion cam = new Camion("Tacoma",45000.00,"Le Toyota Tacoma est un camion compact durable et fiable");
		camionRepository.save(cam);
		}
		 @Test
		 public void testFindCamion()
		 {
		 Camion c = camionRepository.findById(1L).get();
		 System.out.println(c);
		 }
		 @Test
		 public void testUpdateCamion()
		 {
		 Camion c = camionRepository.findById(1L).get();
		 c.setprixcamion(30000.00);
		 camionRepository.save(c);
		 }
		 @Test
		 public void testDeleteCamion()
		 {
			 camionRepository.deleteById(1L);;
		 }
		 @Test
		 public void testListerTousCamions()
		 {
		 List<Camion> cams = camionRepository.findAll();
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }}
		 @Test
		 public void testFindBynomcamion()
		 {
		 List<Camion> cams = camionRepository.findBynomcamion("Tacoma");
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }
		 }
		 @Test
		 public void testFindBynomcamionContains()
		 {
			 List<Camion> cams = camionRepository.findBynomcamionContains("a");
			 for (Camion c : cams)
			 {
			 System.out.println(c);
			 }
			 }
		 @Test
		 public void testfindByNomPrix()
		 {
		 List<Camion> cams = camionRepository.findByNomPrix("Tacoma", 40000.0);
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }
		 }
		 @Test
		 public void testfindByMarque()
		 {
			 Marque mar = new Marque();
		 mar.setIdmar(1L);
		 List<Camion> cams = camionRepository.findByMarque(mar);
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }
		 }
		 @Test
		 public void testfindByByMarqueIdmar()
		 {
		 List<Camion> cams = camionRepository.findByMarqueIdmar(1L);
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }
		  }
		 @Test
		 public void testfindByOrderByNomcamionAsc()
		 {
		 List<Camion> cams =
		 camionRepository.findByOrderByNomcamionAsc();
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }
		 }
		 @Test
		 public void testCamionsNomsPrix()
		 {
		 List<Camion> cams = camionRepository.trierCamionsNomsPrix();
		 for (Camion c : cams)
		 {
		 System.out.println(c);
		 }
		 }


		
		





}
