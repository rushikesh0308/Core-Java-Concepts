//number is divisible by 4 and 6

import java.util.Scanner;
public class Divisible3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if((num%4==0) && (num%6==0))
		{
			System.out.println(num+" is divisible by 4 and 6");
		}else{
			System.out.println(num+" is not divisible by both 4 and 6");
		}
	}
}