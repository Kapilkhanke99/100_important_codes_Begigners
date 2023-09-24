package working_with_numbers;

public class Highest_common_factor {
	
	public static int hcf(int num1,int num2) {
		int hcf=0;
		for(int i =1;i<=num1||i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				hcf=i;
			}
		}
		return hcf;
		
	}
	public static void main(String[] args) {
		System.out.println(hcf(36,60));
	}

}
