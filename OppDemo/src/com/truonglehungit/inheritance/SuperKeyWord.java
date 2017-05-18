package com.truonglehungit.inheritance;

/*
 * super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha.
	super() được sử dụng để gọi trực tiếp constructor của lớp cha.
	super được sử dụng để gọi trực tiếp phương thức của lớp cha.
 */
class Vehicle {
	Vehicle() {
		System.out.println("Vehicle is created");
	}

}

public class SuperKeyWord extends Vehicle {
	int speed;

	SuperKeyWord(int speed) {
		this.speed = speed;
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyWord b = new SuperKeyWord(10);
		//b.display();

	}

}
