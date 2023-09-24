package working_with_numbers;

public class Octal_to_Binary {
	
	public static String ocb(int num) {
		int pow = 0;
		int decimal = 0;
		while(num>0) {
			int r = num%10;
			decimal += r*(int)Math.pow(8, pow);
			num /= 10;
			pow++;
		}
		String str = "";
		while(decimal>0) {
			int r = decimal%2;
			str += r;
			decimal /=2;
		}
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			str2 += str.charAt(i);
		}
		return str2;
	}
	public static void main(String[] args) {
		System.out.println(ocb(11));
	}

}
