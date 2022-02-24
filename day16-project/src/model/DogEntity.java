package model;

import java.util.Objects;

public class DogEntity implements Entity{
	
	private final String name;
	private final int age;
	private final Breeds breed;
	
	private DogEntity(String name, int age, Breeds breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public static DogEntity getDog(String name, int age, Breeds	breed) {
		return new DogEntity(name, age, breed);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, breed, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof DogEntity) || obj == null) return false;
		DogEntity other = (DogEntity) obj;
		return age == other.age && breed.equals(other.breed) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "DogEntity [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	@Override
	public String sayHello() {
		return "Bark, bark, I am " + this.name + " and I'm " + this.age + " years old.";
	}	
	

}
