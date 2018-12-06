package com.practicaljava.lesson7;

public class Contractor extends Person {

	public Contractor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {

		if(percent < increase_cap) {
			
			System.out.println("Increasing hourly rate by "+percent+"%. "+getName());
		}else {
			System.out.println("Can't increase hourly rate for contractor "+getName()+" more than "+increase_cap+"%.");
		}
		
		return false;
	}

}
