package com.mj.text;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		list.remove(2);
		System.out.println(list);
		list.add(2, 3);
		System.out.println(list);
	}

}
