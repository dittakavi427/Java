/**
 * 
 */
package getContacts.getContactsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import getContacts.getContactsrepo.GetContactsRepo;
import getContacts.model.contactEntity;
import getContacts.service.ContactService;
import getContacts.service.contactDTO;

/**
 * @author User
 *
 */
@RestController
public class Controller {
	
	@Autowired
	GetContactsRepo getContactsRepo;
	@Autowired
	ContactService cs;
	
	
	
	@GetMapping("/contact")
	  public List<contactEntity> gethello() {
		
		
		  return getContactsRepo.findAll();
	    
	  }
	  
	 @PostMapping(path="/contact/create")
	    @ResponseStatus(HttpStatus.CREATED)
	    public ResponseEntity<contactEntity> createContact(@RequestBody contactDTO contactCreateDTO){
	        return new ResponseEntity<contactEntity>(cs.createContact(contactCreateDTO), HttpStatus.CREATED);
	    }
	    
	  @PutMapping(path="/editContact/{firstname}")
	  @ResponseStatus(HttpStatus.OK)
	  public ResponseEntity<contactEntity> updateContact(@PathVariable(value ="firstname") String firstname,@RequestBody contactDTO contact){
		  return new ResponseEntity<contactEntity>(cs.updateContact(firstname,contact),HttpStatus.OK);
	  }
}
