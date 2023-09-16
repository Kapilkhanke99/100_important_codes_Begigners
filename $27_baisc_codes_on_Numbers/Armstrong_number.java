package $27_baisc_codes_on_Numbers;

public class Armstrong_number {
	
	public static String Arm(int num) {
		int count = 0;
		int n = num;
		int n2 = num;
		while(num>0) {
			num = num/10;
			count++;
		}
		int sum = 0;
		while(n>0) {
			int r = n%10;
			sum = sum + (int)(Math.pow(r, count));
			n = n/10;
		}
		System.out.println(sum);
		if(n2 == sum) {
			return "The number is armstrong";
		}
		else {
			return "The number is not armstrong";
		}
		
	}
	public static void main(String[] args) {
		System.out.println(Arm(371));
	}

}
