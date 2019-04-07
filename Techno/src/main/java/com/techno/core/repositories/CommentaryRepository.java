package com.techno.core.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techno.core.entities.Artist;
import com.techno.core.entities.Commentary;

public interface CommentaryRepository extends CrudRepository<Commentary, Long>{
	
	public abstract List<Commentary> findByArtist(Artist artist);

}
