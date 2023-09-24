package working_with_numbers;

public class Greatest_commaon_divisor {
	
	public static int gcd(int num1,int num2) {
		int gcd = 0;
		int i=1;
		for(i=1;i<=num1||i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		System.out.println(gcd(15, 70));
	}

}
