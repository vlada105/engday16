package util;

import java.util.List;

public class Stack {

	private final List<Integer> data;

	public Stack(List<Integer> data) {
		super();
		this.data = data;
	}

	public List<Integer> getData() {
		return data;
	}

	public int sum() {
		int s = 0;
		for (int n : data) {
			s += n;
		}
		return s;
	}

}
