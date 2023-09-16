package $27_baisc_codes_on_Numbers;

public class Harshad_Number {
	
	public static int harshad(int num) {
		int sum = 0;
		int n = num;
		while(n>0) {
			int rem = n%10;
			sum += rem;
			n /= 10;			
		}
		if(num%sum == 0)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		if(harshad(45)==1)
			System.out.println("Number is harshad");
		else
			System.out.println("Number is not harshad");
	}

}
