import java.util.Scanner;
class Calculator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("3.Division");
			int choice,num1,num2;
			System.out.println("Enter choice");
			choice=sc.nextInt();
			System.out.println("Enter first no:");
			num1=sc.nextInt();
			System.out.println("Enter second no:");
			num2=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Sum:"+(num1+num2));
				break;
			case 2:
				System.out.println("Subtraction:"+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication:"+(num1*num2));
				break;
			case 4:
				System.out.println("Division:"+(num1/num2));
				break;
			default:
				System.out.println("Invalid Input");
			}
			System.out.println("do you want to continue?? if yes then press y or to stop press n");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}