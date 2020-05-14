package in.tucaurto.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.tucaurto.project.dao.UserDAO;
import in.tucaurto.project.entity.User;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDAO userDao;

	public UserServiceImpl(UserDAO userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void createUser(User user) {
		userDao.save(user);
	
		
	}

	@Override
	public ResponseEntity<User> findUser(String email) {
		User user=userDao.findById(email).get();
		return ResponseEntity.ok().body(user);
	}

	@Override
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users=userDao.findAll();
		return ResponseEntity.ok().body(users);
	}

	@Override
	public ResponseEntity<User> deleteUser(String email) 
	{
		User user=userDao.findById(email).get();
		if(user != null)
		{
			userDao.deleteById(email);
			return ResponseEntity.ok().body(user);
		}
		else
			return null;
		
	}
	

	@Override
	public ResponseEntity<User> editUser(User user) 
	{
		String email=user.getEmail();
		if(userDao.existsById(email))
		{
			userDao.save(user);
			return ResponseEntity.ok().body(user);
		}
		else
			return null;
		
		
	}

	@Override
	public List<User> findByNameContaining(String name) {
		return userDao.findByNameContaining(name);
	}

	@Override
	public List<User> findByCity(String city) {
		return userDao.findByCity(city);
	}

	@Override
	public User findByPhone(long phone) {
		return userDao.findByPhone(phone);
	}
	
	
}
