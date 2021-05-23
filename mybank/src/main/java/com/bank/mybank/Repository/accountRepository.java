/**
 * 
 */
package com.bank.mybank.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.mybank.Model.account;

/**
 * @author Praveen
 *
 */

public interface accountRepository extends MongoRepository<account, String> {
	
	public List<account> findByAccountName(String accountName);
	public List<account> findByAccountId(int id);
	
	
	
	 

	}