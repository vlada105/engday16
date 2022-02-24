package model;



public class Android implements Entity{
	int version;
	int year;
	
	public Android(int version, int year) {
		super();
		this.version = version;
		this.year = year;
	}
	
	
	public int getVersion() {
		return version;
	}

	
	public int getYear() {
		return year;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Android)) {
			return false;
		}
		Android and = (Android) obj;
		return and.version == (this.version) && and.year == (this.year);
	}

	@Override
	public String sayHello() {
		return "Android " + version + " " + year + " says Hello consumer!";
	}
	
	@Override
	public int hashCode() {
		int result = Integer.hashCode(this.getVersion());
		result = 31 * result + Integer.hashCode(this.getYear());
		return result;
	}
	
	

}
