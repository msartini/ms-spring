package com.infraascode.hrworker.services;

import java.util.List;
import java.util.UUID;

import com.infraascode.hrworker.documents.Playlist;

public interface PlaylistService {
	
	public List<Playlist> getAll();
	
	public Playlist getById(UUID id);
	
	public Playlist create(Playlist playlist);
	
	public Playlist getPlaylistByName(String name);
	
}
