import java.util.Scanner;
public class Vote{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int age;
	String res;
	System.out.println("Enter your age");
	age=sc.nextInt();
	res=age>=18?"You can vote":"You can not vote";
	System.out.println(res);
	
}
}