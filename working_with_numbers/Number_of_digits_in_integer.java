package working_with_numbers;

public class Number_of_digits_in_integer {
	public static int digit(int num) {
		int count=0;
		while(num>0) {
			num /= 10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(digit(3456873));
	}

}
