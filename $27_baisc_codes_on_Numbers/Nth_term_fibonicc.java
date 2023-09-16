package $27_baisc_codes_on_Numbers;

public class Nth_term_fibonicc {
	
	public static int N(int num) {
		int a=0,b=1;
		int next = 0;
		for(int i=2;i<num;i++) {
			next = a+b;
			a=b;
			b=next;
		}
		return next;
	}
	public static void main(String[] args) {
		System.out.println(N(15));
	}

}
