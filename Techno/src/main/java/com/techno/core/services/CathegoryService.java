package com.techno.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techno.core.entities.Cathegory;
import com.techno.core.repositories.CathegoryRepository;

@RestController
public class CathegoryService {

	@Autowired
	private CathegoryRepository cathegoryRepositoryDAO;

	@CrossOrigin
	@RequestMapping(path = "/getAllCathegories", method = RequestMethod.GET)
	public Iterable<Cathegory> getAllCathegories() {
		Iterable<Cathegory> findAll = cathegoryRepositoryDAO.findAll();
		return findAll;
	}
}
