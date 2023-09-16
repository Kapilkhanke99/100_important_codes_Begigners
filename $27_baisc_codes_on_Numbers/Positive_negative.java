package $27_baisc_codes_on_Numbers;

import java.util.Scanner;

public class Positive_negative {
	
	public static String posneg(int num) {
		
		if(num<0) {
			return "negative";
		}
		else if(num>0) {
			return "positive";
		}
		else {
			return "Zero";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println(posneg(sc.nextInt()));
       sc.close();
	}

}
