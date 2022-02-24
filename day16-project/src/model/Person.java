package model;

public class Person implements Entity{
	
	private String name;
	private String surname;
	private String faculty;
		

	public Person(String name, String surname, String faculty) {
		super();
		this.name = name;
		this.surname = surname;
		this.faculty = faculty;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	

	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", faculty="
				+ faculty + "]";
	}

	public String sayHello() {
		return "Hello, my name is " + name + " " + surname + " and I am a student of " + faculty;
	}

}
