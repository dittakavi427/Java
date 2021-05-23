package com.contact.consumer.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.contact.consumer.model.Contact;
import com.contact.consumer.service.Service;

@RestController
public class Controller {

	@Autowired
	Service service;

	
	  @PostMapping(value = "/template/createcontact") public String
	  createContacts(@RequestBody Contact contact) throws URISyntaxException {
	  
	  return service.getinfo(contact); }
	  
	  @PutMapping(value = "/template/editContact") public ResponseEntity<Contact>
	  editContacts(@PathVariable String fn) throws URISyntaxException {
	  
	  return service.editInfo(fn); }
	 

	@GetMapping(value="/template/contacts", produces= {MediaType.APPLICATION_JSON_VALUE})
	public String getContact() throws URISyntaxException {
		return  service.getAllContacts();
	}

}
