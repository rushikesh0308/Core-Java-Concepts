//WAP to take number from user and check following condition and print message 
//also user can check this for n no of times.
//user has control to stop execution
//if number is factor of 12 then print msg "i am comfortable in loop"
//if number is factor of 15 then print msg "i am comfortable in if"
// if number is both 12 and 15 then print "i am comfortable in both loop and if"

import java.util.Scanner;
public class CheckFactor{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		checkFactor();
	}
	public static void checkFactor(){
		int num;
		char ch;
		
		do{
			System.out.println("Enter number");
			num=sc.nextInt();
			if(12%num==0 && 15%num==0)
			System.out.println("i am comfortable in both if and loop");
			else if(15%num==0)
			System.out.println("i am comfortable in if");
			else if(12%num==0)
			System.out.println("i am comfortable in loop");
			else
			System.out.println("Invalid input");
			System.out.println("If you want to continue then press y or to stop press any character");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("--------------END-------------------");
	}
	
}