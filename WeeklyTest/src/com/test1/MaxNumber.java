package com.test1;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		System.out.println("Enter third number");
		num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is greater");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is greater");
		}else {
			System.out.println(num3+" is greater");
		}
	}
}
