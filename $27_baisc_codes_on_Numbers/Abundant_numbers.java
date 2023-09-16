package $27_baisc_codes_on_Numbers;

public class Abundant_numbers {
	
	public static boolean abundant(int num) {
		int sum = 0;
		for(int i=1;i<num/2;i++){
			if(num%i == 0) {
				sum += i;
			}
		}
		if(sum>num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		if(abundant(7))
			System.out.println("The number is abundunt");
		else
			System.out.println("The number is not abundunt");
	}

}
