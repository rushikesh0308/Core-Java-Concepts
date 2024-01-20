import java.util.Scanner;
class HighestDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number");
		num=sc.nextInt();
		System.out.println("highest digit is "+highestDigit(num));
	}
	public static int highestDigit(int num){
		int high=Integer.MIN_VALUE;
		while(num!=0){
			int rem=num%10;
			if(rem>high){
				high=rem;
			}
			num/=10;
		}
		return high;
	}
}