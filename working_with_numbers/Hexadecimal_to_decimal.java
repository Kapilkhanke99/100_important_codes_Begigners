package working_with_numbers;

public class Hexadecimal_to_decimal {
	
	public static int hexadecimal(String num) {
		String str = "0123456789ABCDEF";
		int pow=0;
		int hex=0;
		for(int i=num.length()-1;i>=0;i--) {
			char c = num.charAt(i);
			int dec = str.indexOf(c);
			hex += dec*Math.pow(16, pow);
			pow++;
		}
		return hex;
	}
	public static void main(String[] args) {
		
		System.out.println(hexadecimal("C9"));
	}

}
