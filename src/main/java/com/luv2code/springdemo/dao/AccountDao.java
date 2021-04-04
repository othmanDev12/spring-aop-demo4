package com.luv2code.springdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Account;

@Component
public class AccountDao {
	
	private String name;
	private String serviceAccount;
	
	public void addAccount(Account account , boolean vipAcc)  {
		System.out.println(getClass() + " DO SOME DB stuffs: ADD Accont Dao");
	}
	
	public Boolean updateAccount() {
		System.out.println(getClass() + " Update some db stuffs: UPDATE ACCOUNT DAO");
		return false;
	}

	public String getName() {
		System.out.println(getClass() + " in getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " in setName");
		this.name = name;
	}

	public String getServiceAccount() {
		System.out.println(getClass() + " in getServiceAccount");
		return serviceAccount;
	}

	public void setServiceAccount(String serviceAccount) {
		System.out.println(getClass() + " in setServiceAccount");
		this.serviceAccount = serviceAccount;
	}
	
	

}
