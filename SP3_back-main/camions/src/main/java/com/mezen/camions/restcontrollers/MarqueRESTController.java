package com.mezen.camions.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mezen.camions.entities.Marque;
import com.mezen.camions.repos.MarqueRepository;
import com.mezen.camions.service.MarqueService;

@RestController
@RequestMapping("/api/mar")
@CrossOrigin("*")
public class MarqueRESTController {
	
	@Autowired
	MarqueRepository marquerepository;
	
	@Autowired
	MarqueService marqueservice;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Marque> getAllMarques()
	{
	return marquerepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Marque getMarqueById(@PathVariable("id") Long id) {
	return marquerepository.findById(id).get();
	}
	@RequestMapping(path = "/addmarque", method = RequestMethod.POST)
    public Marque createMarque(@RequestBody Marque marque) {

        return marqueservice.saveMarque(marque);

    }






}



