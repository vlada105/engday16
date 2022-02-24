package util;

import java.util.Iterator;
import java.util.List;

public class Stack {

	private final List<Integer> data;

	public Stack(List<Integer> data) {
		super();
		this.data = data;
	}

	public int sum() {
		int s = 0;
		Iterator<Integer> i = data.iterator();
		while (i.hasNext()) {
			s += i.next();
		}
		return s;
	}

}
