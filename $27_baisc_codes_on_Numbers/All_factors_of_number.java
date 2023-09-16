package $27_baisc_codes_on_Numbers;

public class All_factors_of_number {
	
	public static void factors(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		factors(10);
	}
  }


