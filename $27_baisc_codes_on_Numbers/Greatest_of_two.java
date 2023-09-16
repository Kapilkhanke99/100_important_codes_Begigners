package $27_baisc_codes_on_Numbers;

public class Greatest_of_two {
	
	public static String great(int num1,int num2) {
		
		if(num1>num2) {
			return "num1 : "+num1+" is the greatest";
		}
		else if(num2>num1) {
			return "num2 : "+num2+" is the greatest";
		}
		else {
			return "They are equal";
		}
	}
	public static void main(String[] args) {
		System.out.println(great(18,19));
	}

}
