package main;

import model.Entity;

public class Dog implements Entity {
	private final String name;
	private int age;
	private String breeds;
	
	
	public Dog(String name, int age, String breeds) {
		super();
		this.name = name;
		this.age = age;
		this.breeds = breeds;
	}


	@Override
	public String sayHello() {
		return getName() + " say hello!";
	}

	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreeds() {
		return breeds;
	}

	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}

	public String getName() {
		return name;
	}	
	
	
}
