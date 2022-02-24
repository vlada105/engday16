package model;


public class Student implements Entity {
	private String name;
	private String surname;
	
	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + "]";
	}


	@Override
	public String sayHello() {
		return "Hello, my name is: " + this.toString();
	}

}
