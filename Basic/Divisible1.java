//wap divisible by 5

import java.util.Scanner;
public class Divisible1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter number");
	num=sc.nextInt();
	if(num%5==0)
	{
		System.out.println(num+" is divisible by 5");
	}else{
		System.out.println(num+" is not divisible by 5");
	}
}
}