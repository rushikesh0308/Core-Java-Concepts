import java.util.Scanner;
public class StudentMarks{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int marks;
	System.out.println("Enter marks");
	marks=sc.nextInt();
	if(marks>=35)
	{
		System.out.println("Result:Pass");
	}else{
		System.out.println("Result:Fail");
	}
	}

}