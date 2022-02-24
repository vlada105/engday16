package model;

public class Student implements Entity{
	private final String name;
	private final String index;
	

	public Student(String name, String index) {
		super();
		this.name = name;
		this.index = index;
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", index=" + index + "]";
	}




	@Override
	public String sayHello() {
		return "Hello, my name is: "+name; 
	}

}
