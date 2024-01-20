public class SwapNumber{
	public static void main(String[] args){
	int x=10,y=5;

	//without temp var
	x=x+y;//15
	y=x-y;//15-5=10
	x=x-y;
	System.out.println("x:"+x);
	System.out.println("y:"+y);

	//with temp var
	int a=10,b=5,temp;
	temp=a;//10
	a=b;//5
	b=temp;//10
	System.out.println("a:"+a);
	System.out.println("b:"+b);
}
}