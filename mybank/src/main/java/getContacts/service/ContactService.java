/**
 * 
 */
package getContacts.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import getContacts.contactEntity;
import getContacts.getContactsrepo.GetContactsRepo;

/**
 * @author User
 *
 */
@Service
public class ContactService{

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
}
