package working_with_numbers;


public class Binary_to_Decimal {
	
	public static int btd(String bnum) {
		int dec = 0;
		int pow=0;
		int decnum=0;
		for(int i=bnum.length()-1;i>=0;i--) {
			if(bnum.charAt(i)=='0'||bnum.charAt(i)=='1') {
			dec = (bnum.charAt(i)-'0')*(int)Math.pow(2, pow);
			decnum +=dec;
			pow++;			
			}
			else {
				return 0;
			}
		}
		return decnum;
	}
	public static void main(String[] args) {
		String n = "221001";
		if(btd(n)==0) {
			System.out.println("The number is invalid");
		}
		else
			System.out.println(btd(n));
	}

}
