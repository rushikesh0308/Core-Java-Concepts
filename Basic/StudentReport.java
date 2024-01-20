//wap to take marks from user and find whether student is pass or not
import java.util.Scanner;
public class StudentReport{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int marks;
	String res;
	System.out.println("Enter your marks");
	marks=sc.nextInt();
	res=marks>=35?"Pass":"Fail";
	System.out.println(res);
	
}
}