package $27_baisc_codes_on_Numbers;

public class Perfect_square {
	
	public static boolean sqaure(int num) {
//		int n=num;
//		int evencount=0;
//		while(n%2==0) {
//			n=n/2;
//			evencount++;			
//			}
		//int oddcount=0;
//		
//		for(int i=3;i<n;i+=2) {
//			
//			while(n%i==0) {
//				n = n/i;
//				oddcount++; 
//			}
//			if(oddcount%2==1) {
//				break;
//			}
		    
		
		
//		}
//		if(evencount%2==0)
//		return true;
//		else
//		return false;
		int sqrt = 0;
		int i =1;
		while(sqrt<=num) {
			sqrt = i*i;
			if(sqrt==num)
				return true;
			i++;
		}
			return false;
		
}		
			
	public static void main(String[] args) {
		System.out.println(sqaure(1024));
	}
}
