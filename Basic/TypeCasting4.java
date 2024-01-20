public class TypeCasting4{
	public static void main(String[] args){
	char ch='\u0000';//null char
	System.out.println('a'+ch+'a');

	char ch1='a';
	int av1=(int)ch1;
	System.out.println(ch1+"="+av1);

	int av2=65;
	char ch2=(char)av2;
	System.out.println(av2+"="+ch2);
}
}