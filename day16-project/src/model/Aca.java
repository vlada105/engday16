package model;

public class Aca implements Entity{
	private final String name;
	private final String sport;
	private final int age;
	
	
	public Aca(String name, String sport, int age) {
		super();
		this.name = name;
		this.sport = sport;
		this.age = age;
	}
	@Override
	public boolean equals(Object aca) {
		Aca a = (Aca) aca;
		return a.name.equalsIgnoreCase(name) && a.sport.equalsIgnoreCase(sport) && a.age==age;
	}
	@Override
	public int hashCode() {
		return 31*name.hashCode()+17*sport.hashCode()+age;
	}

	@Override
	public String sayHello() {
		return "Hello, I'm " + name + ", I love playing " + sport + " and I'm " + age + " years old!";
	}

}
