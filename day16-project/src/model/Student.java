package model;

public class Student implements Entity{
		private int id;
		private String name;
		private String surname;
		
		public Student(int id, String name, String surname) {
			super();
			this.id = id;
			this.name = name;
			this.surname = surname;
		}
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
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

		public boolean equals(Object obj) {
			if(!(obj instanceof Student)) {
				return false;
			}
			Student s = (Student) obj;
			return getId() == s.getId();
		}
		@Override
		public String sayHello() {
			return "Hello, my name is: "+this.toString();
		}


		@Override
		public String toString() {
			return getName() +" "+getSurname();
		}
}
