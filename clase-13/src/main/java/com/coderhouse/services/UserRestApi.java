package com.coderhouse.services;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.interfaces.UserRestInterface;
import com.coderhouse.modelos.User;

@Service
public class UserRestApi implements UserRestInterface {

	private final String BASE_URL = "https://64dd48f6e64a8525a0f7cb2c.mockapi.io/users";

	private RestTemplate restTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		try {
			@SuppressWarnings("rawtypes")
			ResponseEntity<List> response = restTemplate.exchange(BASE_URL, HttpMethod.GET, null, List.class);
			return response.getBody();
		} catch (Exception e) {
			throw new RuntimeException("Error al obtener los Usuarios" + e.getMessage(), e);
		}
	}

	@Override
	public User addUsers(User user) {
		try {
			ResponseEntity<User> response = restTemplate.postForEntity(BASE_URL, user, User.class);
			return response.getBody();
		} catch (Exception e) {
			throw new RuntimeException("Error al agregar los Usuarios" + e.getMessage(), e);
		}
	}

	@Override
	public User updateUsers(User user) {
		try {
			restTemplate.put(BASE_URL + "/", user.getId(), user);
			return user;
		} catch (Exception e) {
			throw new RuntimeException("Error al actualizar al Usuario" + e.getMessage(), e);
		}
	}

	@Override
	public void deleteUsers(String id) {
		try {
			String url = BASE_URL + "/" + id;
			restTemplate.delete(url);
		} catch (Exception e) {
			throw new RuntimeException("Error al eliminar al Usuario" + e.getMessage(), e);
		}

	}

	@Override
	public User getUserById(String id) {
		try {
			String url = BASE_URL + "/" + id;
			ResponseEntity<User> response = restTemplate.exchange(url, HttpMethod.GET, null, User.class);
			return response.getBody();
		} catch (Exception e) {
			throw new RuntimeException("Error al obtener el Usuario" + e.getMessage(), e);
		}
	}

}
