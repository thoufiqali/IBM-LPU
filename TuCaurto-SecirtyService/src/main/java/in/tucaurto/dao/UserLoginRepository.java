package in.tucaurto.dao;

import org.springframework.data.repository.CrudRepository;

import in.tucaurto.entity.UserLogin;

public interface UserLoginRepository extends CrudRepository<UserLogin, Integer> {
    UserLogin findByUsername(String username);
}
