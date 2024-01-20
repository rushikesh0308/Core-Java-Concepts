public class Logical
{
	public static void main(String[] args)
	{
		int a=10,b=20,c=10;
		
		System.out.println(a<b && a==c);//true
		System.out.println(a<b || a==c);//true
		System.out.println(!(a==c));//false
		System.out.println(b>a && c==a);//true
		System.out.println(!(b>a && c==a));//false
		System.out.println(c!=a || a>b);//false
	}
}