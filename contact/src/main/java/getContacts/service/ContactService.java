/**
 * 
 */
package getContacts.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import getContacts.getContactsrepo.GetContactsRepo;
import getContacts.model.contactEntity;

/**
 * @author User
 *
 */
@Service
public class ContactService {

	@Autowired
	GetContactsRepo ContactRepository;
	
	
	public  contactEntity createContact(contactDTO ContactCreateDTO) {
		contactEntity newContact = new contactEntity();

        newContact.setCid(UUID.randomUUID());
        newContact.setFirstname(ContactCreateDTO.getFirstname());
        newContact.setLastname(ContactCreateDTO.getLastname());
        newContact.setPhonenumber(ContactCreateDTO.getPhonenumber());
        newContact.setEmailid(ContactCreateDTO.getEmailid());
        

        ContactRepository.save(newContact);
        return newContact;
        
    }

	public contactEntity updateContact(String firstname,contactDTO contact) {
		contactEntity contact1=ContactRepository.getByFirstname(firstname);
		contact1.setEmailid(contact.getEmailid());
		contact1.setFirstname(contact.getFirstname());
		contact1.setLastname(contact.getLastname());
		contact1.setPhonenumber(contact.getPhonenumber());
		ContactRepository.save(contact1);
		return contact1;
	}

}
