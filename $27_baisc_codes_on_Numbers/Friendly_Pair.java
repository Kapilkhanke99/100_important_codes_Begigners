package $27_baisc_codes_on_Numbers;

public class Friendly_Pair {
	
	public static int friend(int num) {
		int sum = 0;
		for(int i=1;i<num/2;i++) {
			if(num%i==0) {
				sum += i;
			}
		}		
		return num/sum;
	}
public static void main(String[] args) {
	if(friend(31)==friend(140))
		System.out.println("it is freindly pair");
	else
		System.out.println("it is not a freindly pair");
    }
}
