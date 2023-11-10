package com.robertp.W2L3;

public abstract class ServiceAnimal {
	
	protected String name;
	
	public ServiceAnimal(String name) {
		this.name = name;
	}

	abstract void helpOwner();
	
	public void beAwesome() {
		System.out.println("I am being awesome at my job");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
