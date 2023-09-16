package $27_baisc_codes_on_Numbers;

public class prime_Factor_of_Number {
	
	public static void main(String[] args) {
		int num = 100 ;
		while(num%2==0) {
			System.out.print(2+" ");
			num /= 2;
		}
		
		for(int i=3;i<=num;i+=2) {
			while(num%i==0) {
				System.out.print(i+" ");
				num/=i;
			}
		}
	}

}
