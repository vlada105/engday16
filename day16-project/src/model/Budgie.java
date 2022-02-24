package model;

import java.awt.Color;

public class Budgie implements Entity {
	
	private final String name;
	private final Color color;
	private final double weight;
	
	public Budgie(String name, Color color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
		public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String sayHello() {
		return "Hello , " + this.name + "! Your Color " + this.color + " is beautifull";
	}

	@Override
	public String toString() {
		return "Budgie [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (this.getClass() != obj.getClass()) return false;
		
		if (!(obj instanceof Budgie)) return false;
		
		Budgie bObj = (Budgie) obj;
		
		return bObj.name.equals(this.name) && bObj.color.equals(this.color) && Double.compare(bObj.weight, this.weight) == 0;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
