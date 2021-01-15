package cmsProject_Practice;

import java.util.Scanner;

public class Calculator3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double first = s.nextDouble();
		double second = s.nextDouble();
		System.out.println("Enter an operator +, - , *, /");
		char operator = s.next().charAt(0);
		double result;
		switch (operator) {
		case '+':
			result =first+second;
			break;
		case '-':
			result =first-second;
			break;
		case '*':
			result =first*second;
			break;
		case '/':
			result =first/second;
			break;
		default:
			System.out.printf("Error! operator is not correct");
	        return;
		}
		System.out.println(first + " " + operator + " " + second + " = " + result);
	}

}
