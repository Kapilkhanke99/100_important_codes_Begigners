package $27_baisc_codes_on_Numbers;

public class Armstrong_in_range {
	
	public static void armRange(int num) {
		int n1 = num,n2 = num;
		int count = 0;
		int sum = 0;
		while(n1>0) {
			n1 = n1/10;
			count++;
		}
		while(n2>0) {
			int r = n2%10;
			sum = sum + (int)Math.pow(r, count);
			n2 = n2/10;
		}
		if(num == sum) 
			System.out.println(num);
		
	}
	public static void main(String[] args) {
		int min = 121;
		int max = 400;
		for(int i = min;i<=max;i++) {
			armRange(i);
		}
	}

}
