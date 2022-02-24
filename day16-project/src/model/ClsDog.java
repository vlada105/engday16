package model;

import java.util.Objects;

public class ClsDog implements Entity {

	private final String name;

	public ClsDog(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Entity))
			return false;
		ClsDog other = (ClsDog) obj;
		return Objects.equals(name, other.name);
	}


	@Override
	public String sayHello() {
		return "Dog "+name+" says: Bark!";
	}

	@Override
	public String toString() {
		return "ClsDog [name=" + name + "]";
	}

	
	
}
