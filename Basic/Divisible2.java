//divsible by 10 or not.display q nd rem

import java.util.Scanner;
public class Divisible2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num,que,rem;
		
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num%10==0)
		{
			System.out.println(num+" is divisible by 10");
		}else{
			System.out.println(num+" is not divisible by 10");
			que=num/10;
			rem=num%10;
			System.out.println("Rem:"+rem);
			System.out.println("Quetient:"+que);
		}
	}

}