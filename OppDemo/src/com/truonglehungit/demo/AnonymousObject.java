package com.truonglehungit.demo;

class Caculation{
	
	void fact(int n){
		int fact =1;
		for(int i= 1;i<n;i++){
			fact = fact *i;
		}
		System.out.println("factorial is "+fact);
	}
}
public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Caculation().fact(5);
		
	}

}
