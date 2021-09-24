package com.infraascode.hrworker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.infraascode.hrworker.repositories.PlaylistRepository;
 
@Component
public class DummyData implements CommandLineRunner{
	private final PlaylistRepository playlistRepository;
	
    DummyData(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    	
//  	playlistRepository.deleteAll();
    	
//   	playlistRepository.save(new Playlist(UUID.randomUUID().toString(), "Spring and mongo db"));
    	
    }

}
