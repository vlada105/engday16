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
		
		
		@Override
		public String sayHello() {
			return "Hello, my name is: "+this.toString();
		}


		@Override
		public String toString() {
			return name +" "+surname;
		}
		
		
		
	
		
}
