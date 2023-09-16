package $27_baisc_codes_on_Numbers;

public class Sum_of_range {
	
	public static int sum(int num1,int num2) {
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(10, 13));
	}

}
