package fr.aberwag.controller;

import fr.aberwag.domain.User;
import fr.aberwag.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController{
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public Iterable<User> findAll(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{name}")
	public List<User> findUserByName(@PathVariable String name){
		return userRepository.findByLastName(name);
	}
}
