package $27_baisc_codes_on_Numbers;

public class Power_of_number {
	
	public static int power(int num,int pow) {
		int power = 1;
		for(int i=0;i<pow;i++) {
			power *= num;
		}
		return power;
	}
	public static void main(String[] args) {
		System.out.println(power(3, 3));
	}

}
