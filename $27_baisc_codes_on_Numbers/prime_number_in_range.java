package $27_baisc_codes_on_Numbers;

public class prime_number_in_range {
	
	public static boolean prime(int num) {
		if(num<2) 
			return false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
		}
		
	
	public static void main(String[] args) {
		int min = 10;
		int max = 20;
		for(int i=min;i<=max;i++) {
			if(prime(i)) {
				System.out.println(i );
			}
		}
	}

}
