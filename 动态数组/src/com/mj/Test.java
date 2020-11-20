package com.mj;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Person> list=new ArrayList<>();
			list.add(null);
			list.add(new Person(2,"zhang"));
			int indexOf = list.indexOf(new Person(2,"zhang"));
			System.out.println(indexOf);
			System.out.println(list);
		//
	}

}
