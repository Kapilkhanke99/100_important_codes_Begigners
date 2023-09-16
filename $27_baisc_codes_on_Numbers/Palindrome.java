package $27_baisc_codes_on_Numbers;

public class Palindrome {
	
	public static String palindrome(int num) {
		int newnum = 0;
		int n = num;
		while(num>0) {
			int r = num%10;
			newnum = newnum*10 + r;
			num = num/10;
		}
		
		if(n == newnum) {
			return "The number is palindrome";
		}
		else {
			return "The number is not palindrome";
		}
	}
	public static void main(String[] args) {
		System.out.println(palindrome(1231));
	}

}
