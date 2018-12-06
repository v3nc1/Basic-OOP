package com.practicaljava.lesson7.tryit;

public class Contractor implements Payable {
	private String name;
	
	public Contractor(String name) {
		
		this.name=name;
	}

	
	public boolean increasePay(int percent) {


			if(percent < Payable.increase_cap) {
				
				System.out.println("Increasing salary by "+percent+"%. "+name);
			}else {
				System.out.println("Can't increase payment for contractor "+name+" more than "+increase_cap+"%.");
			}
			return false;
	}

}
