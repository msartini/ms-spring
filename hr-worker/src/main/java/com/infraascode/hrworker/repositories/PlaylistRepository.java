package com.infraascode.hrworker.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.infraascode.hrworker.documents.Playlist;

public interface PlaylistRepository  extends MongoRepository<Playlist, UUID>{
	
	public List<Playlist> findByName(String name);
	
}
