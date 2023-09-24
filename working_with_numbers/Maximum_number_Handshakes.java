package working_with_numbers;

public class Maximum_number_Handshakes {
	
	public static int mnh(int n) {
		int fact1 = 1;
		int fact2 = 1;
		
		for(int i=1;i<=n;i++) {
			fact1 *= i;
		}
		for(int i=1;i<=n-2;i++) {
			fact2 *= i;
		}
		return fact1/(fact2*2);
	}
	public static void main(String[] args) {
		System.out.println(mnh(4));
	}

}
