package com.Project.Tool;

public class Employee {
	String name;
	int age;
	
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+ this.name + " Age: "+ this.age);
	}
	
	
	
}
