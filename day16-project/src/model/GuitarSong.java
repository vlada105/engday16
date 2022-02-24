package model;

import java.util.Objects;
import java.util.Random;

public class GuitarSong implements Entity {

	private final String stringE = "E";
	private final String stringA = "A";
	private final String stringD = "D";
	private final String stringG = "G";
	private final String stringB = "B";
	private final String stringe = "e";
	
	private int song;
	
	public GuitarSong(int song) {
		 this.song = song;
	}
	
	public String playSong() {
		String notes = "";
		for(int i = song;i>0;i-=(13+i%4)) {
			int k = i%6;
			switch(k) {
			case 0:notes+=stringE+",";
			case 1:notes+=stringA+",";
			case 2:notes+=stringD+",";
			case 3:notes+=stringG+",";
			case 4:notes+=stringB+",";
			case 5:notes+=stringe+",";
			}
		}
		return notes;
	}
	
	@Override
	public String toString() {
		return "GuitarSong [song=" + song + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(song, stringA, stringB, stringD, stringE, stringG, stringe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuitarSong other = (GuitarSong) obj;
		return song == other.song && Objects.equals(stringA, other.stringA) && Objects.equals(stringB, other.stringB)
				&& Objects.equals(stringD, other.stringD) && Objects.equals(stringE, other.stringE)
				&& Objects.equals(stringG, other.stringG) && Objects.equals(stringe, other.stringe);
	}

	@Override
	public String sayHello() {
		return playSong();
	}
}
