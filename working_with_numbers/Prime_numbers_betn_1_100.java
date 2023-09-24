package working_with_numbers;

public class Prime_numbers_betn_1_100 {
	
	public static int prime(int n) {
	int flag = 0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0) {
			return 1;
			
		}
	}
	return flag;
  }
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(prime(i)==0)
				System.out.println(i);
		}
	}

}
