package main;

import model.Entity;
import model.GuitarSong;

public class Main {
	public static void main(String[] args) {
		Entity g = new GuitarSong(260);
		System.out.println(g.sayHello());
	}
}