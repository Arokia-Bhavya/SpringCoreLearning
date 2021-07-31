package com.learning.demo;

public class Customer {
	String name;

	public Customer() {
		super();
		System.out.println("Customer no arg constructor");

	}

	public Customer(String name) {
		super();
		System.out.println("Customer param constructor");

		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
