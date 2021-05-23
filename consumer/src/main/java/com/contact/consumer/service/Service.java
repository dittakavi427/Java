package com.contact.consumer.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.contact.consumer.model.Contact;
import com.contact.consumer.model.Contacts;

@Component
public class Service {

	@Autowired RestTemplate restTemplate;

	
	public String getinfo(Contact contact) throws URISyntaxException {
		URI url=new URI("http://localhost:8080/contact/create");
		RequestEntity<Contact> requestEntity=RequestEntity.
		post(url).
		contentType(MediaType.APPLICATION_JSON).
		body(contact);
		
		ResponseEntity<Contact> result=restTemplate.exchange(url, HttpMethod.POST, requestEntity, Contact.class);
				
		return result.getStatusCode()+" This is HTTP status";
	}
	
	public String getAllContacts() throws URISyntaxException{
		URI url=new URI("http://localhost:8080/contact");		
		
		ResponseEntity<String> results=restTemplate.getForEntity(url, String.class);
		
		
		return results.toString();
	}
	
	public String getContactById() throws URISyntaxException{
		URI url=new URI("http://localhost:8080/contact");		
		
		ResponseEntity<String> results=restTemplate.getForEntity(url, String.class);
		
		
		return results.toString();
	}

	public ResponseEntity<Contact> editInfo(String firstName) throws URISyntaxException {
		URI url=new URI("http://localhost:8080/editContact/"+firstName);
		Contact c=new Contact();
		
		c.setFirstName(firstName);
		c.setEmailId("helo@bilbo.com");
	
		HttpEntity<Contact> requestUpdate = new HttpEntity<>(c);
		ResponseEntity<Contact> results=restTemplate.exchange(url, HttpMethod.PUT, requestUpdate, Contact.class);
		System.out.println(results.getBody().getEmailId());
		return results;
	}

}
