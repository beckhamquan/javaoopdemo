package com.truonglehungit.demo;

class Account {
	int acc_no;
	String name;
	float amount;

	// insert record
	void insertRecord2(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	void insert(int a, String n, float amt) {
		a = acc_no;
		n = name;
		amt = amount;
	}
	// deposit funcition
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}

	// withdraw
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + "withdraw");
		}
	}
	//check balance
	void checkBalance(){
		System.out.println("Balance is "+amount);
	}
	//display information
	void displayInformation(){
		System.out.println(acc_no + ","+name +","+amount);
	}
}

public class CreateMutipleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a2 =new Account();
		//a1.insertRecord2(10,"hung",500);
		a2.insertRecord2(1,"hung",500);
		a2.displayInformation();
	
		
	}

}
