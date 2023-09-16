package $27_baisc_codes_on_Numbers;

public class even_odd {
	public static String checknum(int num) {
		if(num%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	public static void main(String[] args) {
		System.out.println(checknum(-6));
	}

}
