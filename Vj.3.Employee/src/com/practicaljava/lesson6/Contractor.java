package com.practicaljava.lesson6;

public class Contractor extends Person implements Payable {

	public Contractor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {


			if(percent < increase_cap) {
				
				System.out.println("Increasing salary by "+percent+"%. "+getName());
			}else {
				System.out.println("Can't increase payment for contractor "+getName()+" more than "+increase_cap+"%.");
			}
			return false;
	}

}
