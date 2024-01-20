import java.util.Scanner;
public class Ternary{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n1,n2,max;
	System.out.println("Enter first no");
	n1=sc.nextInt();
	System.out.println("Enter second no");
	n2=sc.nextInt();
	max=n1>n2?n1:n2;
	System.out.println("Max:"+max);
}
}