package com.app.java.logic;

public class SwapTwoValues {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	b=b+a;
	a=b-a;
	b=b-a;
	System.out.printf("a is %d, b is %d", a, b);			

	}

}
