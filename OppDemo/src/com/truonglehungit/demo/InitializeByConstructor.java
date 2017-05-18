package com.truonglehungit.demo;

class Employee{
	int id;
	String name;
	float salary;
	
	void insertRecord(int i,String n,float s){
		id = i;
		name =n;
		salary = s;
	}
	//
	void displayInformation(){
		System.out.println(id+","+name +","+salary);
	}
}
public class InitializeByConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 =new Employee();
		e1.insertRecord(1, "hung1",	 10000);
		e2.insertRecord(2, "hung2", 35000);
		e1.displayInformation();
		e2.displayInformation();
		
	}

}
