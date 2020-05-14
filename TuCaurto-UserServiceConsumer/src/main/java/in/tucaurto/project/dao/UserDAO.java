package in.tucaurto.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.tucaurto.project.entity.User;
@Repository
@EnableTransactionManagement
public interface UserDAO extends JpaRepository<User, String> 
{
	@Query
	public List<User> findByCity(String city);
	@Query
	public List<User> findByNameContaining(String name);
	@Query
	public User findByPhone(long phone);
	
}
