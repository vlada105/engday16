package model;

public class Cat implements Entity{
	private final String name;
	private String color;
	public Cat(String name) {
		
		this.name = name;
	}
	
	public Cat(String name, String color) {
		this(name);
		this.color = color;
	}
	
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", color: " + getColor();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cat))
			return false;
		return getName().equalsIgnoreCase(((Cat)obj).getName());
	}

	@Override
	public String sayHello() {
		return "Meow Meow";
	}
	
}
