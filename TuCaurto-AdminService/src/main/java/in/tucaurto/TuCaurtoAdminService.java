package in.tucaurto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class TuCaurtoAdminService 
{
	
	public static void main(String[] args) {
		SpringApplication.run(TuCaurtoAdminService.class, args);
	}
}
