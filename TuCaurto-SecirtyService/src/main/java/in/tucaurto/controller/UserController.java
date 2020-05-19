package in.tucaurto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins= "http://localhost:4200")
public class UserController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }
    
    @RequestMapping(value="/admin", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public String adminPortal()
    {
    	return "Welcome to Admin Portal";
    }
    @RequestMapping(value="/user", method = RequestMethod.GET)
    @PreAuthorize("hasRole('USER')")
    public String userPortal()
    {
    	return "Welcome to User Portal";
    }
    
    @PreAuthorize("hasRole('SUPPORT')")
    @RequestMapping(value="/support", method = RequestMethod.GET)
    public String supportPortal()
    {
    	return "Welcome to Support Portal";
    }
}
