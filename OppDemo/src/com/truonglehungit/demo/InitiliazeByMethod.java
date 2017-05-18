package com.truonglehungit.demo;

class Student {
	int id;
	String name;

	void insertRecord(int r, String n) {
		id = r;
		name = n;
	}
	void displayInformation(){
		System.out.println(name);
	}
}

public class InitiliazeByMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Student s1 = new Student();
		s1.insertRecord(1, "hung");
		s1.displayInformation();
	}

}
