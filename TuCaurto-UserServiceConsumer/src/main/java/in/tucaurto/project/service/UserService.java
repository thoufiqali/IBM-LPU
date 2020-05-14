package in.tucaurto.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import in.tucaurto.project.entity.User;

public interface UserService
{
	public void createUser(User user);
	
	public ResponseEntity<User> findUser(String email);
	public ResponseEntity<List<User>> listAllUsers();
	public ResponseEntity<User> deleteUser(String email);
	public ResponseEntity<User> editUser(User user);
	public List<User> findByNameContaining(String name);
	public List<User> findByCity(String city);
	public User findByPhone(long phone);
}
