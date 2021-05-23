package getContacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"getContacts.*"})
public class GetContactsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(GetContactsApplication.class, args);
	}

}
