package cmsProject_Practice;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value which is test wether odd or even");
		int value = s.nextInt();
		if (value%2==0) {
			System.out.println("its an even number "+value);
			
		}
		else {
			System.out.println("its an odd  number "+value);
		}

	}

}
