package working_with_numbers;

public class Replace_0_with_1 {
	
	public static String replace(int num) {
		String str = Integer.toString(num);
		
		//str = str.replace('0', '1');
		String str2 = "";
		for(int i=0;i<=str.length()-1;i++) {
			char c = str.charAt(i);
			if(c=='0')
				str2 = str2 + 1;
			else
				str2 = str2+str.charAt(i);
			}
		
		return str2;			
	}
	public static void main(String[] args) {
		System.out.println(replace(1001));
	}

}
