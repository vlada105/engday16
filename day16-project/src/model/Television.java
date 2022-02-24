package model;

import java.util.Objects;

public class Television implements Entity {
	private final int size;
	private final int productionYear;
	private final String modelName;

	public Television(int dimensions, int productionYear, String modelName) {
		super();
		this.size = dimensions;
		this.productionYear = productionYear;
		this.modelName = modelName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, modelName, productionYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		return size == other.size && Objects.equals(modelName, other.modelName)
				&& productionYear == other.productionYear;
	}

	@Override
	public String sayHello() {
		return "Hello this is " + modelName + " made " + productionYear ;
	}

}
