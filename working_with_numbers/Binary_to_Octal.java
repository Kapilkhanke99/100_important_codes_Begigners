package working_with_numbers;

public class Binary_to_Octal {
	
	public static String btc(int bnum ) {
		int decimal = 0;
		int pow = 0;
		while(bnum>0) {
			int r = bnum%10;
			decimal = decimal+r*(int)Math.pow(2, pow);
			bnum /= 10;
			pow++;
		}
		String str = "";
		while(decimal>0) {
			int r = decimal%8;
			str += r;
			decimal /=8;
		}
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			str2 += str.charAt(i);
		}
		return str2;
	}
	public static void main(String[] args) {
		System.out.println(btc(1000));
	}

}
