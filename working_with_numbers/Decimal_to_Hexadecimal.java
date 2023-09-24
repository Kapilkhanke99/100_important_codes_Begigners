package working_with_numbers;

public class Decimal_to_Hexadecimal {
	
	public static String dth(int num) {
		String str = "0123456789ABCDEF";
		String str2 = "";
		while(num>0) {
			int rem = num%16;
			str2 += str.charAt(rem);
			num = num/16;
		}
		String str3 = "";
		for(int i=str2.length()-1;i>=0;i--) {
			str3 += str2.charAt(i);
		}
		return str3;
	}
	public static void main(String[] args) {
		System.out.println(dth(273));
	}

}
