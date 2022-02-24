package model;

public class Person implements Entity {
	private String firstname;
	private String lastname;
	private long uniquePersonCode;
	
	public Person(String firstname, String lastname, long uniquePersonCode) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.uniquePersonCode = uniquePersonCode;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public long getUniquePersonCode() {
		return uniquePersonCode;
	}
	
	public void setUniquePersonCode(long uniquePersonCode) {
		this.uniquePersonCode = uniquePersonCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person) obj;
		return getUniquePersonCode() == p.getUniquePersonCode();
	}
	
	@Override
	public String toString() {
		return getFirstname() + " " + getLastname();
	}

	@Override
	public String sayHello() {
		return "Hello, my name is " + toString() + "!";
	}

}
