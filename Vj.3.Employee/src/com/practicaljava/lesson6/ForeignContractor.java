package com.practicaljava.lesson6;

public class ForeignContractor extends Person implements Payable{

	public ForeignContractor(String name) {
		super(name);
		
	}
	
	public boolean increasePay(int percent) {

		System.out.println("I am poor alien worker!!");
		return true;
	}

}
