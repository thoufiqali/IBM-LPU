package in.tucaurto.service;

import java.util.List;

import in.tucaurto.entity.CustomerSupport;

public interface SupportService 
{
	public String createSupport(CustomerSupport support);
	public List<CustomerSupport> findAll();
	public String deleteByUsername(String username);
}
