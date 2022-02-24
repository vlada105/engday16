package model;

public class Pas implements Entity{
	
	private String ime;
	private String rasa;	

	public Pas(String ime, String rasa) {
		super();
		this.ime = ime;
		this.rasa = rasa;
	}

	@Override
	public String sayHello() {
		
		return "Dog named " + ime +  " rase "  + rasa + "  barks.";
	}

	@Override
	public String toString() {
		return "Pas [ime=" + ime + ", rasa=" + rasa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((rasa == null) ? 0 : rasa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pas other = (Pas) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (rasa == null) {
			if (other.rasa != null)
				return false;
		} else if (!rasa.equals(other.rasa))
			return false;
		return true;
	}

}
