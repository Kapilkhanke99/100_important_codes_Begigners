package working_with_numbers;

public class Permutation_n_people_occupy_r_seats {
	
	public static int pnr(int n,int r) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		int fact2 = 1;
		for(int i=1;i<=n-r;i++) {
			fact2 *= i;
		}
		return fact/fact2;
	}
	public static void main(String[] args) {
		System.out.println(pnr(5, 9));
	}

}
