package $27_baisc_codes_on_Numbers;

public class Reverse_number {
	
	public static int reverse(int num) {
		int rev  = 0;
		while(num>0) {
			int r = num%10;
			rev = rev*10 + r;
			num /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println(reverse(1001));
	}

}
