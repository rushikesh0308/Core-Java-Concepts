class Pattern
{
	public static void main(String[] args) {
		// System.out.println(isFactorial(5));
		// System.out.println(sumNatural(20));
		System.out.println(checkPower(2,3));
	}
	public static long checkFactorial(int num){
		long fact=1l;
		for(int i=1;i<=num;i++){
			fact*=i;
		}
		return fact;
	}
	public static int isFactorial(int num){
		if(num==1 || num==0)
			return 1;
		return num*isFactorial(num-1);
	}
	public static int sumNatural(int num){
		if(num==1 || num==0)
			return 1;
		return num+sumNatural(num-1);
	}
	public static int checkPower(int base,int raise){
		if(raise==0)
			return 1;
		return base*checkPower(base,raise-1);
	}
}