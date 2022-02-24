package model;

public class Salmon implements Entity {

	private String type, countryOfOrigin;
	private double weight;

	public Salmon(String type, String countryOfOrigin, double weight) {
		this.type = type;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String sayHello() {
		return "Hello, i'm " + this.getType() + " salmon. I live in " + this.getCountryOfOrigin() + ". My weight is "
				+ this.getWeight() + " kg.";
	}

}
