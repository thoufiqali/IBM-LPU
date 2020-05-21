package in.tucaurto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.tucaurto.entity.CustomerSupport;
@Repository
public interface SupportDAO extends JpaRepository<CustomerSupport, Long>
{
	@Query
	boolean existsByUsername(String username);
	void deleteByUsername(String username);
	List<CustomerSupport> findByNameContaining(String name);
	CustomerSupport findByContactNumber(long number);
	CustomerSupport findByUsername(String username);
}
