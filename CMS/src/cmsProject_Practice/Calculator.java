package cmsProject_Practice;

import java.util.Scanner;

public class Calculator {

	public static int add(int m , int n) {
		int c=m+n;
		return c;
	}
	public static int mul(int m , int n) {
		int c=m*n;
		return c;
	}
	public static int div(int m , int n) {
		int c=m/n;
		return c;
	}
	public static int sub(int m , int n) {
		int c=m-n;
		return c;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter m value");
		int m=s.nextInt();
		System.out.println("Enter n value");
		int n =s.nextInt();
		
	System.out.println("Addition" +Calculator.add(10,20));
	System.out.println("multiplication" +Calculator.mul(10,20));
	System.out.println("division" +Calculator.div(10,20));
	System.out.println("substraction" +Calculator.sub(10,20));

	}

}
