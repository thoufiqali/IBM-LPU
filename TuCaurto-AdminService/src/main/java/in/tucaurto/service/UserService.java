package in.tucaurto.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import in.tucaurto.entity.User;

public interface UserService
{
	public User findUser(String email);
	public List<User> listAllUsers();
	public String deleteUser(String email);
	public List<User> findByNameContaining(String name);
	public List<User> findByCity(String city);
	public User findByContactNumber(long contactNumber);
}
