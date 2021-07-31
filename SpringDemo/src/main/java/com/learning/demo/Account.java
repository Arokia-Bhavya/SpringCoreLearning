package com.learning.demo;

public class Account {

	public Account() {
		super();
		System.out.println("Account no arg constructor");

	}

	Customer customer;

	@Override
	public String toString() {
		return "Account [customer=" + customer + "]";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(Customer customer) {
		super();
		System.out.println("Account param constructor");
		this.customer = customer;
	}
}
