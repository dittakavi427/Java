package com.bank.mybank.Service;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.bank.mybank.Model.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.*;


/**
 * @author User
 *
 */
@Service
public class withDrawService {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
public synchronized String withDraw(long withDrawAmount, String AccountName) {
	Query query = new Query();
	query.addCriteria(Criteria.where("accountName").is(AccountName));
	List<account> result = mongoTemplate.find(query, account.class);
	long balance = result.get(0).getbalance();
	if(balance!=0 && balance>withDrawAmount) {
	balance=balance-withDrawAmount;
    Update update = new Update();
    update.set("balance", balance);
    mongoTemplate.findAndModify(query, update, account.class);
	return "balance after withdrawl is "+balance;
	}else
		return "balance "+balance+" less than requested amount "+withDrawAmount;
}
public synchronized String deposit(long depositAmount, int id) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("accountId").is(id));
		List<account> result = mongoTemplate.find(query, account.class);
		long balance = result.get(0).getbalance();
		balance=balance + depositAmount; 
	    Update update = new Update();
	    update.set("balance", balance);
	    mongoTemplate.findAndModify(query, update, account.class);
	return "Updated Balance is "+ balance + " of user "+ result.get(0).getaccountName();
}



}
