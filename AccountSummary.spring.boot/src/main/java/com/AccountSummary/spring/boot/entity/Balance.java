package com.AccountSummary.spring.boot.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Balance {

	 private String available;
	    private String current;
	    private String hold;
	    private String overdraftLimit;
	   // private String currency;
	
	

}
