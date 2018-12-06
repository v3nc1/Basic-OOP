package com.practicaljava.lesson7;

public class Employee extends Person {

	public Employee(String name) {
		super(name);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {

		System.out.println("Increasing salary by "+percent+"%. "+getName());
		return false;
	}

}
