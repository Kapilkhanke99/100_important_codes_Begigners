package $27_baisc_codes_on_Numbers;

public class Perfect_number {
	
	public static String perfect(int num) {
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		if(num==sum)
			return "The number is perfect";
		else
			return "The number is not perfect";
	}
	public static void main(String[] args) {
		System.out.println(perfect(28));
	}

}
