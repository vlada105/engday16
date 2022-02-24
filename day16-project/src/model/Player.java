package model;

import java.util.Objects;

public class Player implements Entity {
	int id;
	String name;

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String sayHello() {
		return "Player#"+ id +" says hello!";
	}

	@Override
	public String toString() {
		return "Player #" + id + " name=" + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if( obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player player = (Player) obj;
		return Integer.compare(this.id, player.getId()) == 0 && Objects.equals(name, player.name);
	}

}
