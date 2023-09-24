package working_with_numbers;

public class Addition_of_two_fractions {
	
	public static String addition(int num1,int num2,int den1,int den2) {
		int a = num1*den2+num2*den1;
		int b = den1*den2;
		//System.out.println(a+" "+b);
		for(int i=2;i<=a||i<=b;i++) {
			while(a%i==0&&b%i==0) {
				a = a/i;
			    b= b/i;
			}
		}
		return a+"/"+b;
	}
	public static void main(String[] args) {
		System.out.println(addition(10, 10, 10, 10));
	}

}
