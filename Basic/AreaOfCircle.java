import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double radius,pi=3.14,area;
	System.out.println("Enter radius");
	radius=sc.nextDouble();
	area=pi*radius*radius;
	System.out.println("Area of Cirle:"+area);
	}
}