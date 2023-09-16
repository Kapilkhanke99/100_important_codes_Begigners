package $27_baisc_codes_on_Numbers;

public class Strong_Numbers {
	
	public static String strong(int num) {
		int n = num;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			int fact = 1;
			for(int i=1;i<=rem;i++) {
				fact *= i;
			}
			sum += fact;
			n = n/10;
		}
		if(num == sum)
			return "Its a strong number";
		else
     		return "its not a strong number";	
	}
	public static void main(String[] args) {
		System.out.println(strong(141));
	}

}
