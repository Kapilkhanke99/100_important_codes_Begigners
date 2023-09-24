package working_with_numbers;

public class Least_common_factor {
	
	public static int lcm(int num1,int num2) {
		int prod = num1*num2;
		int i=0;

//		for(i=2;i<=prod;i++) {
//			if(i%num1==0&&i%num2==0) {
//				break;
//			}
//		}
		
		if(num1>num2) {
			for(i=num1;i<=prod;i++) {
				if(i%num1==0&&i%num2==0) {
					break;
				}
			}
		}
		else {
				for(i=num2;i<=prod;i++) {
					if(i%num1==0&&i%num2==0) {
						break;
					}
				}
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(lcm(11, 7));
	}

}
