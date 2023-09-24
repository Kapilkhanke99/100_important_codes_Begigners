package working_with_numbers;

public class Express_number_as_sum_of_two_prime {
	
	public static int sum(int num) {
		int flag=1;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=0;
			break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int n = 16;
		
		for(int i=2;i<=n/2;i++)
		if(sum(i)==1) {
			if(sum(n-i)==1) {
				System.out.println(i+" + "+(n-i));
			}
		}
	}

}
