package com.test.testapi.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.test.testapi.model.User;
import com.test.testapi.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/backend")
@RequiredArgsConstructor
public class UserController 
{
	  private final UserService userService;


	  @GetMapping("/users")
	  public List<User> getAllUsers()
	  {
		  return userService.getUsers();
	  }
	  
	  @GetMapping("/users/{id}")
	  public Optional<User> getUser(@PathVariable Long id) 
	  {
		  return userService.getUserById(id);
	  }
	  
	  @PostMapping("/user/signup")
	  public ResponseEntity<User> addUser(@RequestBody User user)
	  {
		  URI uri = URI.create(ServletUriComponentsBuilder
				  .fromCurrentContextPath().path("/backend/user/signup").toUriString());
		  return ResponseEntity.created(uri).body(userService.addUser(user));
	  }
	  
	  @DeleteMapping("/user/{id}")
	  public ResponseEntity<User> deleteUser(@PathVariable Long id)
	  {
		  userService.deleteUser(id);
		 
		  return ResponseEntity.ok().build();
	  }
	  
	  @PutMapping("/users")
	  public ResponseEntity<User> updateUser(@RequestBody User user)
	  {
		  return ResponseEntity.ok().body(userService.updateUser(user));
	  }
	  
  
}
