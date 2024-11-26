package com.mezen.camions.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mezen.camions.entities.Camion;
import com.mezen.camions.service.CamionService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CamionRESTController {
	@Autowired
	private CamionService camionservice;
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Camion> getAllCamions() {
		return camionservice.getAllCamions();
		}
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Camion getCamionById(@PathVariable("id") Long id) {
	return camionservice.getCamion(id);
}
	
	@RequestMapping(path="/addcam",method = RequestMethod.POST)
	public Camion createCamion(@RequestBody Camion camion) {
	return camionservice.saveCamion(camion);
	}
	@RequestMapping(path="/updatecam",method = RequestMethod.PUT)
	public Camion updateCamion(@RequestBody Camion camion) {
	return camionservice.updateCamion(camion);
	}
	@RequestMapping(value="/delcam/{id}",method = RequestMethod.DELETE)
	public void deleteCamion(@PathVariable("id") Long id)
	{
	camionservice.deleteCamionById(id);
	}
	@RequestMapping(value="/CamionMarq/{Idmar}",method = RequestMethod.GET)
	public List<Camion> getCamionByIdmar(@PathVariable("Idmar") Long Idmar) {
	return camionservice.findByMarqueIdmar(Idmar);
	}




}
