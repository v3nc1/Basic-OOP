package com.practicaljava.lesson7;

public abstract class Person {
	
	private String name;
	private String address;
	int increase_cap=20;

	
	
	
	public Person(String name) {
		
		this.name=name;
		
	}
	
	public String getName() {
		
		return "Person's name is "+name;
	}
	
	public void changeAddress(String address) {
		
		this.address=address;
		System.out.println("New address is "+address);
		
	}
	
	public void promote(int percent) {
		
		System.out.println("Promoting a worker...");
		giveDayOff();
		increasePay(percent);
		
	}
	
	public void giveDayOff() {
		
		System.out.println("Giving a day off to "+name);
		
	}
	
	public abstract boolean increasePay (int percent);

}
