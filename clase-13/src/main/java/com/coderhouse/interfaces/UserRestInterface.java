package com.coderhouse.interfaces;

import java.util.List;

import com.coderhouse.modelos.User;

public interface UserRestInterface {
	
	public List<User> getUsers();
	
	public User addUsers(User user);
	
	public User updateUsers(User user);
	
	public void deleteUsers(String id);
	
	public User getUserById(String id);	

}
