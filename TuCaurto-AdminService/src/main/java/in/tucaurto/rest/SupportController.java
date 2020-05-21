package in.tucaurto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tucaurto.entity.CustomerSupport;
import in.tucaurto.service.SupportService;

@RestController
@RequestMapping("/support-api")
public class SupportController 
{
	@Autowired
	private SupportService supportService;
	
	
	public SupportController(SupportService supportService) {
		super();
		this.supportService = supportService;
	}



	@GetMapping("/support")
	public ResponseEntity<List<CustomerSupport>> listUsers()
	{
		return ResponseEntity.ok().body(supportService.findAll());
	}
	


	@DeleteMapping("/support/{supportId}")
	public ResponseEntity<String> deleteUser(@PathVariable(name="supportId") String email)
	{
		return ResponseEntity.ok().body(supportService.deleteByUsername(email));
	}
	

}
