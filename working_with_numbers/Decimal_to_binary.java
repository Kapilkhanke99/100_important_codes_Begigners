package working_with_numbers;

public class Decimal_to_binary {
	
	public static String dob(int num) {
		String str = "";
		while(num>0) {
			int rem = num%2;
			str += rem;
			num /= 2;
		}
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2 += str.charAt(i);
		}
		return str2;
	}
	public static void main(String[] args) {
		System.out.println(dob(15));
	}

}
