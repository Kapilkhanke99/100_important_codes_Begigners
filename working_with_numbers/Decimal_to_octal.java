package working_with_numbers;

public class Decimal_to_octal {
	
	public static String doc(int num) {
		
		String str = "";
		while(num>0) {
			int rem = num%8;
			str += rem;
			num = num/8;
		}
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			str2 += str.charAt(i);
		}
		return str2;
	}
	public static void main(String[] args) {
		 System.out.println(doc(9));
	}

}
