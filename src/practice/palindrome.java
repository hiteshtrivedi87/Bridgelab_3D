package practice;

public class palindrome {
	public static void main(String[] args) {
		int number=123;
		int number1=number;
		int reversenumber=0;
		int reminder;
		while(number!=0) {
			reminder=number%10;
			reversenumber=reversenumber*10+reminder;
			number=number/10;
		}
		if(number1==reversenumber) {
			System.out.print("palindrome");
		}
		else {
			System.out.print("notpalindrome");
		}
		
	}
}
