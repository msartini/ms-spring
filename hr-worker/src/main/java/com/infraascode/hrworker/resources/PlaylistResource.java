package com.infraascode.hrworker.resources;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infraascode.hrworker.documents.Playlist;
import com.infraascode.hrworker.services.PlaylistService;

@RestController
@RequestMapping("/playlists")
public class PlaylistResource {

	@Autowired
	private PlaylistService playlistService;
	
	@GetMapping
	public List<Playlist> getAll() {
		return this.playlistService.getAll();
	}
	
	@GetMapping("/{id}")
	public Playlist getById(@PathVariable UUID id) {
		return this.playlistService.getById(id);
	}
	
	@PostMapping
	public Playlist create(@RequestBody Playlist playlist) {
		return this.playlistService.create(playlist);
	}
	
}
