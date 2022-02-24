package model;

public class Student implements Entity {
	private String name;
	private String chatFriendName;
	String sentMessage;
	String recievedMessage;
	
	
	public Student (String name, String chatFrString) {
		this.name = name;
		this.chatFriendName = chatFrString;
	}
	

	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getChatFriendName() {
		return chatFriendName;
	}




	public void setChatFriendName(String chatFriendName) {
		this.chatFriendName = chatFriendName;
	}




	@Override
	public String sayHello() {
		
		return "Hello " + chatFriendName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj.getClass() != this.getClass()) {
			return false;
		}
		
		Student s = (Student) obj;
		
		if(this.getName() == s.getName() && this.getChatFriendName() == s.getChatFriendName()) {
			return true;
		} else return false;
		
		
	}
	
	
	
	public String getSentMessage() {
		return sentMessage;
	}




	public void setSentMessage(String sentMessage) {
		this.sentMessage = sentMessage;
	}




	public String getRecievedMessage() {
		return recievedMessage;
	}




	public void setRecievedMessage(String recievedMessage) {
		this.recievedMessage = recievedMessage;
	}




	/*
	 * public void getMessage(Student s2, String p) { this.recievedMessage =
	 * s2.sendMessage(p, this); }
	 */

	public String sendMessage(String p, Student s) {
		s.setRecievedMessage(p);
		
		return p;
	}
	

}
