package in.tucaurto.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private final String username;

	public JwtResponse(String jwttoken, String username) {
		this.jwttoken = jwttoken;
		this.username = username;
	}


	public String getUsername() {
		return username;
	}


	public String getToken() {
		return this.jwttoken;
	}
	
	
}