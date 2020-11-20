package com.mj;

public class Person {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Person() {
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age) {
			return false;
		} 
		if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
