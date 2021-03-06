package com.techno.core.services;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techno.core.entities.Artist;
import com.techno.core.entities.Cathegory;
import com.techno.core.repositories.ArtistRepository;
import com.techno.core.repositories.CathegoryRepository;

@RestController
public class ArtistService {

	@Autowired
	private ArtistRepository artistRepositoryDAO;

	@Autowired
	private CathegoryRepository cathegoryRepositoryDAO;
	
	@CrossOrigin
	@RequestMapping(path = "/getAllArtist", method = RequestMethod.GET)
	public Iterable<Artist> getAllArtist() {

		Iterable<Artist> findAll = artistRepositoryDAO.findAll();
		return findAll;
	}

	@CrossOrigin
	@RequestMapping(path = "/getArtist", method = RequestMethod.GET)
	public Artist getArtist(@RequestParam String id) {

		long newId = Long.valueOf(id);
		Artist findArtist = artistRepositoryDAO.findById(newId);
		return findArtist;

	}
	
	@CrossOrigin
	@RequestMapping(path = "/addArtist", method = RequestMethod.POST)
	public @ResponseBody String addArtist(@RequestParam String name, @RequestParam String cathegory,
			@RequestParam String img, @RequestParam String description) throws ParseException {
		
		long idCat = Long.valueOf(cathegory);
		Cathegory cat = cathegoryRepositoryDAO.findById(idCat);
		Artist artist = new Artist();
		artist.setName(name);
		artist.setCathegory(cat);
		artist.setImg(img);
		artist.setDescription(description);
		artistRepositoryDAO.save(artist);
		return "";
	}
}
