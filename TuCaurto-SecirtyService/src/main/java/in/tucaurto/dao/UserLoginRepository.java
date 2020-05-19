package in.tucaurto.dao;

import org.springframework.data.repository.CrudRepository;

import in.tucaurto.entity.UserLogin;

public interface UserLoginRepository extends CrudRepository<UserLogin, Long> {
    UserLogin findByUsername(String username);
}
