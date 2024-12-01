package com.mezen.camions.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mezen.camions.entities.Marque;
import com.mezen.camions.repos.MarqueRepository;

@RestController
@RequestMapping("/api/mar")
@CrossOrigin("*")
public class MarqueRESTController {
	
	@Autowired
	MarqueRepository marquerepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Marque> getAllMarques()
	{
	return marquerepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Marque getMarqueById(@PathVariable("id") Long id) {
	return marquerepository.findById(id).get();
	}


}
