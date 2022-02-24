package model;

import java.util.Objects;

public class EntityImpl implements Entity {
	private final String name;
	private final String position;
	private final String country;
	private final String interests;

	public EntityImpl(String name, String position, String country, String interests) {
		this.name = name;
		this.position = position;
		this.country = country;
		this.interests = interests;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getCountry() {
		return country;
	}

	public String getInterests() {
		return interests;
	}
		

	@Override
	public int hashCode() {
		return Objects.hash(country, interests, name, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityImpl other = (EntityImpl) obj;
		return Objects.equals(country, other.country) && Objects.equals(interests, other.interests)
				&& Objects.equals(name, other.name) && Objects.equals(position, other.position);
	}

	@Override
	public String sayHello() {
		return "Hi i'm " + name + ", and i'm " + position + " of " + country + ", and i want to " + interests ;
	}

	@Override
	public String toString() {
		return "EntityImpl [name=" + name + ", position=" + position + ", country=" + country + ", interests="
				+ interests + "]";
	}
	

}
