package $27_baisc_codes_on_Numbers;

public class Sum_of_digits {
	
	public static int sum(int num) {
		int sum=0;
		while(num>0) {
			int r = num%10;
			sum += r;
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(1000));
	}

}
