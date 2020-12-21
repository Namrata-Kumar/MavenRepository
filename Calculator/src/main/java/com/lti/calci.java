package com.lti;

public class calci {
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	public static int mul(int num1,int num2) {
		return num1*num2;
	}
	public static int div(int num1,int num2) {
		return num1/num2;
	}
	public static void main(String []args) {
		System.out.println("Addition= "+add(10,20) );
		System.out.println("Diffrence= "+sub(10,20) );
		System.out.println("Multiple= "+mul(10,20) );
		System.out.println("Division= "+div(10,20) );
		System.out.println("This is a basic Calculator ");
	}

}
