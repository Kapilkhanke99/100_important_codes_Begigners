package $27_baisc_codes_on_Numbers;

import java.util.Scanner;

public class Greatest_of_three {
	static int num1;
	static int num2;
	static int num3;
	public  String greatest() {	
		if(num1>num2&&num1>num3) {
			return "num1: "+ num1 +" is the greatest";
		}
		else if(num2>num3) {
			return "num2: "+ num2 +" is the greatest";
		}
		else {
			return "num3: "+ num3 +" is the greatest";
		}
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Greatest_of_three  g = new Greatest_of_three();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.println(g.greatest());
		sc.close();
	}			

}
