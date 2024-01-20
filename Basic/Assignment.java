import java.util.Scanner;
public class Assignment
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int marks1,marks2,marks3,total;
		double avg;
		System.out.println("Enter marks of first subject");
		marks1=sc.nextInt();
		System.out.println("Enter marks of second subject");
		marks2=sc.nextInt();
		System.out.println("Enter marks of third subject");
		marks3=sc.nextInt();
		total=marks1+marks2+marks3;
		avg=total/3;
		System.out.println("Total Marks: "+total);
		System.out.println("Average: "+avg);
	}
}