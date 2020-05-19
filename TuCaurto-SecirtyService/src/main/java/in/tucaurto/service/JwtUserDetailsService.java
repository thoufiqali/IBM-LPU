package in.tucaurto.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import in.tucaurto.dao.UserLoginRepository;
import in.tucaurto.dao.UserRepository;
import in.tucaurto.entity.User;
import in.tucaurto.entity.UserDTO;
import in.tucaurto.entity.UserLogin;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UserLoginRepository userloginDao;
	
	@Autowired
	private UserRepository userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserLogin userLogin = userloginDao.findByUsername(username);
		if (userLogin == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(userLogin.getUsername(), userLogin.getPassword(),
				new ArrayList<>());
	}

	public String save(UserDTO user) {
		
		UserLogin newUser = new UserLogin();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		
		User userDetails= new User(user.getName(),user.getUsername(),user.getContactNumber());
		userDetails.setUserLogin(newUser);
		userDao.save(userDetails);
		return "Successfully registered !!";
	}
}
