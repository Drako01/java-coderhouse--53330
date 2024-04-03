package com.coderhouse.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelos.User;
import com.coderhouse.services.UserRestApi;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRestApi userRestApi;
	
	@GetMapping(value= "/", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> getUsers(){
		try {
			List<User> users = userRestApi.getUsers();
			return new ResponseEntity<>(users, HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>("Error al obtener Usuarios" + e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(value= "/" , consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> addUsers(@RequestBody User user){
		try {
			User newUser = 	userRestApi.addUsers(user);
			return new ResponseEntity<>(newUser, HttpStatus.CREATED);		
			
		}catch(Exception e){
			return new ResponseEntity<>("Error al agregar al Usuario " + e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}

	@PutMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		try {
			User updateUser =userRestApi.updateUsers(user);
			return new ResponseEntity<>(updateUser, HttpStatus.OK);	
			
		}catch(Exception e){
			return new ResponseEntity<>("Error al modificar al Usuario " + e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable String id) {
		try {
			userRestApi.deleteUsers(id);
			return new ResponseEntity<>( HttpStatus.NO_CONTENT);	
			
		}catch(Exception e){
			return new ResponseEntity<>("Error al eliminar al Usuario " + e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
	
	@GetMapping(value= "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> getUserBuId(@PathVariable String id){
		try {
			User user = userRestApi.getUserById(id);
			if(user != null) {
				return new ResponseEntity<>( HttpStatus.OK);
			} else {
				return new ResponseEntity<>( HttpStatus.NOT_FOUND);
			}
			
		}catch(Exception e){
			return new ResponseEntity<>("Error al obtener al Usuario " + e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
}
