package com.truonglehungit.constructor;
class Student{
	int id;
	String name;
	Student(int i,String n){
		id = i;
		name = n;
	}
	//copy constructor
	Student(Student s){
		id = s.id;
		name = s.name;
				
	}
	void display(){
		System.out.println("ID "+id+",Name "+name);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(1,"hung1");
		Student s2= new Student(s1);
		s1.display();
		System.out.println("display copy constructor");
		s2.display();
	}

}
