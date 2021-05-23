package com.contact.consumer.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contacts implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private List<Contact> contacts;

}
