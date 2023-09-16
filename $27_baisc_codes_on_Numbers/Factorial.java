package $27_baisc_codes_on_Numbers;

public class Factorial {
	
	public static int fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact *= i;
		}
			
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
