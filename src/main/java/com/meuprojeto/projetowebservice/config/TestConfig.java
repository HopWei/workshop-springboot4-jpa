package com.meuprojeto.projetowebservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.meuprojeto.projetowebservice.entities.User;
import com.meuprojeto.projetowebservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Lucas", "lc@gmail.com", "00000000000", "123456");
		User u2 = new User(null, "Giulliana", "giu@gmail.com", "11111111111", "098765");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
