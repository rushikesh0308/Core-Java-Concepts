class ArmStrong{
	public static void main(String[] args) {
		for(int i=1;i<=5000;i++){
			if(isArmstrong(i))
				System.out.println(i);
		}
	}
	public static int count(int num){
		int ct=0;
		while(num!=0){
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int base,int raise){
		int pow=1;
		for(int i=0;i<raise;i++){
			pow=pow*base;
		}
		return pow;
	}
	public static boolean isArmstrong(int num){
		int temp=num,sum=0,ct=count(num);
		while(num!=0){
			int rem=num%10;
			sum=sum+power(rem,ct);
			num/=10;
		}
		return temp==sum;
	}
}