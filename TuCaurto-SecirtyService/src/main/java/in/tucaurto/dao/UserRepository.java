package in.tucaurto.dao;

import org.springframework.data.repository.CrudRepository;

import in.tucaurto.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	
}
