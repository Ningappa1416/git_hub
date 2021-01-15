package cmsProject_Practice;

import java.util.Scanner;

public class Add_Mul_div {

	static int add;
	static int sub;
	static int mul;
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter first value ");
		 int first = s.nextInt();
		 System.out.println("Enter the scond value");
		 int second = s.nextInt(); 
		 add= first+second;
		 mul=first*second;
		 sub=first-second;
		 System.out.println("addition....>"+add);
		 System.out.println("multiplication....>"+mul);
		 System.out.println("Substraction...>>"+sub);
		 
	}
	

}
