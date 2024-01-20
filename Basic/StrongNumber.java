import java.util.Scanner;
public class StrongNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter starting no");
		start=sc.nextInt();
		System.out.println("Enter ending no");
		end=sc.nextInt();
		int i;
		for(i=start;i<=end;i++){
			if(isStrong(i))
			System.out.println(i);
		}
	}
	public static int factorial(int num){
		int fact=1;
		while(num!=0){
			fact*=num;
			num--;
		}
		return fact;
	}
	public static boolean isStrong(int num){
		int temp=num,sum=0,rem;
		while(num!=0){
			rem=num%10;
			sum=sum+factorial(rem);
			num/=10;
		}
		return temp==sum;
	}

}