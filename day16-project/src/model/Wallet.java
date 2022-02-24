package model;

public class Wallet implements Entity{
	private String ownersName;
	private double amount;
	
	public Wallet(String ownersName, double amount) {
		this.ownersName = ownersName;
		this.amount = amount;
	}
	public String getOwnersName() {
		return ownersName;
	}
	public double getAmount() {
		return amount;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Wallet))return false;
		Wallet other = (Wallet) obj;
		return other.amount == amount && other.getOwnersName().equals(ownersName);
	}
	@Override
	public String toString() {
		return "Wallet [ownersName=" + ownersName + ", amount=" + amount + "]";
	}
	@Override
	public String sayHello() {
		return "Hello, my amount will make you sad.";
	}
	
	
	
	

}
