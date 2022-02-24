package model;

public class Cat implements Entity {
	
	private final String name;
	private final String breed;
	private int age;
	private String owner;
	
	public Cat(String name, String breed, int age, String owner) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.owner = owner;
	}

	@Override
	public String sayHello() {
		return name + ": Meow... Purr Purr Purrr";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

}
