package com.robertp.W2L3;

public class Cat extends ServiceAnimal implements HousePet  {
	
	public Cat(String name) {
		super(name);
	}
	
	public void giveOwnerAffection() {
		System.out.println("Giving owner affection");
	}
	
	public void sleepInside() {
		System.out.println("Sleeping inside");
	}
	
	public void helpOwner() {
		System.out.println("Helping my owner out");
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}
	
	

}
