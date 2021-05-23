/**
 * 
 */
package getContacts.getContactsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import getContacts.model.contactEntity;

/**
 * @author User
 *
 */
@Repository
public interface GetContactsRepo extends JpaRepository<contactEntity,String>{
	contactEntity getByFirstname(String firstname);
	

}
