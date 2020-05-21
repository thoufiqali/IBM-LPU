package in.tucaurto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tucaurto.entity.User;
import in.tucaurto.entity.UserDTO;
import in.tucaurto.service.UserService;

@RestController
@RequestMapping("/user-api")
public class UserController 
{
	@Autowired
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> listUsers()
	{
		return ResponseEntity.ok().body(userService.listAllUsers());
	}
	
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable(name="userId") String email)
	{
		return ResponseEntity.ok().body(userService.deleteUser(email));
	}
	
}
