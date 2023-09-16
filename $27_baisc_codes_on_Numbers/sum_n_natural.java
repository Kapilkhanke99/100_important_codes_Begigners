package $27_baisc_codes_on_Numbers;

public class sum_n_natural {
	
	public static int sum(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(10));
	}

}
