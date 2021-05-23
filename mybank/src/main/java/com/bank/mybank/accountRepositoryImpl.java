/**
 * 
 */
package com.bank.mybank;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.bank.mybank.Model.account;
import com.bank.mybank.Repository.accountRepository;
import com.bank.mybank.Service.withDrawService;

/**
 * @author User
 *
 */
@Component
public class accountRepositoryImpl implements CommandLineRunner{
	
	@Autowired
	  private accountRepository repository;
	@Autowired
	  private withDrawService WDS;
	
	@Override
	  public void run(String... args) throws Exception {

		
	    // save a couple of customers
		 
		  //repository.save(new account(4, "Smith",6000));
		List<account> x = repository.findByAccountName("Alice");
		System.out.println(WDS.withDraw(20000,"Alice"));
		System.out.println(WDS.deposit(20000,x.get(0).getaccountId()));
		System.out.println(WDS.withDraw(200,"Alice"));
		
	    // fetch all customers
	    System.out.println("Customers found with findAll():");
	    System.out.println("-------------------------------");
	    for (account customer : repository.findAll()) {
	      System.out.println(customer);
	    }
	    System.out.println();

	    // fetch an individual customer
		
		
		  System.out.println("Customer found with findByAccount_Name('Alice'):");
		  System.out.println("--------------------------------");
		  System.out.println(repository.findByAccountName("Alice"));
		  System.out.println(repository.findByAccountId(2));
		
		 

	  }

	

}
