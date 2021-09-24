package com.infraascode.hrworker.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infraascode.hrworker.documents.Playlist;
import com.infraascode.hrworker.repositories.PlaylistRepository;
import com.infraascode.hrworker.services.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {
	
	@Autowired
	private PlaylistRepository playlistRepository;

	@Override
	public List<Playlist> getAll() {
		return this.playlistRepository.findAll();
	}

	@Override
	public Playlist getById(UUID id) {
		return this.playlistRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Playlist não existe."));
	}

	@Override
	public Playlist create(Playlist playlist) {
		playlist.setId(UUID.randomUUID());
		
		Playlist parent = 
				this.playlistRepository
					.findById(playlist.getParent().getId())
					.orElseThrow(() -> new IllegalArgumentException("Playlist Pai inexistente."));
		
		playlist.setParent(parent);
		
		return this.playlistRepository.save(playlist);
	}

	@Override
	public Playlist getPlaylistByName(String name) {
		// return (Playlist) this.playlistRepository.findByName(name);
		return null;
	}
	
}
