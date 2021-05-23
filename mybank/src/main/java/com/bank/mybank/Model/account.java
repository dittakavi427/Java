/**
 * 
 */
package com.bank.mybank.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import net.minidev.json.JSONObject;



/**
 * @author Praveen
 *
 */
@Document(collection="account")
public class account {
	@Id
	private String id;
	private net.minidev.json.JSONObject obj;
	public JSONObject getId() {
		obj=new JSONObject();
		obj.put("_id",id);
		return obj;
	}

	private int accountId;
	private String accountName;
	private long balance;
	
	
	
	/**
	 * @param accountId
	 * @param accountName
	 * @param balance
	 */
	public account(int accountId, String accountName, long balance) {
		
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
	}
	/**
	 * @return the accountId
	 */
	public int getaccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setaccountId(int accountId) {
		accountId = accountId;
	}
	/**
	 * @return the accountName
	 */
	public String getaccountName() {
		return accountName;
	}
	/**
	 * @param accountName the accountName to set
	 */
	public void setaccountName(String AccountName) {
		accountName = AccountName;
	}
	/**
	 * @return the balance
	 */
	public long getbalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setbalance(long balance) {
		this.balance = balance;
	}
	
	 @Override
	  public String toString() {
		return String.format(
	        "Customer[ accountId='%d', AccountName='%s', balance='%d']",accountId,accountName, balance);
	  }
}
