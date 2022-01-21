package com.smarcosm.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.smarcosm.workshopmongo.domain.User;
import com.smarcosm.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User isadora = new User(null, "Isadora Cristina", "isadora@gmail.com");
		User isabel = new User(null, "Isabel Melissa", "isabel@gmail.com");
		User isaac = new User(null, "Isaac Vieira", "isaac@gmail.com");
		User israelle = new User(null, "Israelle Cristina", "israelle@gmail.com");
		
		userRepository.saveAll(Arrays.asList(isadora, isabel, isaac, israelle));
		
	}

}
