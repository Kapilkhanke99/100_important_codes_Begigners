package working_with_numbers;

public class number_of_integers_which_has_exactly_x_divisors {

	public static int noInt(int num) {
		int count = 1;//1 for number itselef
		//ineeficient to run loop full loop just for last number
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int minNo = 1;
		int maxNo = 100;
		int noOfDiv = 3;
		for(int i=minNo;i<=maxNo;i++) {
			if(noInt(i)==noOfDiv)
				System.out.print(i+" ");
		}
	}
}
