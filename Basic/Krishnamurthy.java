import java.util.Scanner;
public class Krishnamurthy{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkKrishnamurthy(num)){
			System.out.println(num+" is Krishnamurthy");
		}else{
			System.out.println(num+" is not Krishnamurthy");
		}
	}
	public static int checkFactorial(int num){
		int fact=1;
		while(num>0){//5>0 4>0
			fact=fact*num;//fact=5,20
			num--;
		}
		return fact;
	}
	public static boolean checkKrishnamurthy(int num){
		int sum=0;
		int temp=num;
		while(num!=0){
			int rem=num%10;
			sum=sum+checkFactorial(rem);
			num/=10;
		}
		return temp==sum;
	}
}