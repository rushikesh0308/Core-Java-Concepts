import java.util.Scanner;
public class UserInput3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char:");
		char ch=sc.next().charAt(0);
		System.out.println("char:"+ch);
	}
}