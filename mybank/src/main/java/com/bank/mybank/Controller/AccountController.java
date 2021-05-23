/**
 * 
 */
package com.bank.mybank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.mybank.Model.account;
import com.bank.mybank.Repository.accountRepository;
import com.bank.mybank.Service.withDrawService;

import net.minidev.json.JSONObject;

/**
 * @author Praveen
 *
 */
@RestController
public class AccountController {
	@Autowired
	  private accountRepository repository;
	@Autowired
	  private withDrawService WDS;
	@GetMapping("/accounts/{id}")
	  public List<account> getAccountById(@PathVariable("id") int id) {
		return repository.findByAccountId(id);
	    
	  }

	  @GetMapping("/accounts")
	  public List<account> getAccounts(@RequestBody account account) {
		return repository.findAll();
	    
	  }
	  
	  @PostMapping("/accounts/{id}")
	  public String updateAccount(@RequestBody account accountdetails,@PathVariable("id") int id) {
		  
		return WDS.deposit(accountdetails.getbalance(), id);
	    
	  }
	  @CrossOrigin(origins="http://localhost:4200")
	  @PostMapping("/accounts/new")
	  public JSONObject creatAccount(@RequestBody account accountdetails) {
		  
				repository.save(accountdetails);
				
				return repository.findByAccountName(accountdetails.getaccountName()).get(0).getId();
	    
	  }
}
