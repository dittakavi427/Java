/**
 * 
 */
package getContacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * @author User
 *
 */
@SpringBootApplication
@ComponentScan({"getContacts.*"})
public class ContactApp {
	public static void main(String[] args) {
		SpringApplication.run(ContactApp.class, args);
	}
}