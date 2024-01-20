import java.util.Scanner;
	public class Divisibility{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int num,rem=0;
	System.out.println("Enter number");
	num=sc.nextInt();//23
	if(num%7==0){
		System.out.println(num+" is divisible by 7");
	}else{
		rem=num%7;//23%7=2
		num=num+(7-rem);//num=23+(7-2)=28
		System.out.println("We need to add:"+(7-rem));
	}
}
}