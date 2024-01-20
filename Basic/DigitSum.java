import java.util.Scanner;
class DigitSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Sum of digit is "+digitSum(num));
	}
	public static int digitSum(int num){
		int sum=0;
		while(num!=0){
			sum=sum+(num%10);
			num/=10;
		}
		return sum;
	}
}