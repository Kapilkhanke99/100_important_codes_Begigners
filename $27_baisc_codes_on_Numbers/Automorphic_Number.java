 package $27_baisc_codes_on_Numbers;

public class Automorphic_Number {
	
	public static boolean automor(int num) {
		int n = num;
		int sq = n*n;
		while(n>0) {
			if(n%10!=sq%10) {
				return false;
			}
				n = n/10;
				sq = sq/10;
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		if(automor(89)) {
			System.out.println("The number is automorphic");
		}
		else {
			System.out.println("the number is not auto");
		}
	}

}
