package $27_baisc_codes_on_Numbers;

public class Prime_numbers {
		
	public static String prime(int num1) {
		boolean flag = true;
		for(int i=2;i<=num1/2;i++) {
			if(num1%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			return "It is prime";
		}
		else {
			return "It is not prime";
		}
	}
	public static void main(String[] args) {
		System.out.println(prime(37));
	}

}
