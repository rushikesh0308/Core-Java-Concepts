//wap to find number even or odd
import java.util.Scanner;
public class EvenOddCheck{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int num;
	String res;
	System.out.println("Enter number");
	num=sc.nextInt();
	if(num==0)
	System.out.println("Neither even nor odd");
	else
	{
		int rem=num%2;
		res=rem==0?"Even":"Odd";
	System.out.println("Result:"+res);
}
	
	
}
}