public class IncrementOp
{
	public static void main(String[] args)
	{
		//int a=10;
		//a++;
		//System.out.println("a:"+a);11
		//System.out.println(++a);11
		//System.out.println(a++);//10
		//System.out.println(a);//11

		//int b;
		//b=a++;
		//System.out.println("a"+a);//11
		//System.out.println("b"+b);//10

		int x=10,y=20;
		int z;
		z=++x+y++;

		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}
}