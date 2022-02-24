package model;

import java.util.Objects;

public class Worker implements Entity {

	private final String nameString;
	private int age;
	
	public Worker(String nameString, int age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Deni [nameString=" + nameString + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return 31*Integer.hashCode(age)+getNameString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return age == other.age && nameString.equals(other.getNameString());
	}

	public String getNameString() {
		return nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return this.getNameString()+" says hello, i am "+this.getAge()+" years old.";
	}
	

}
