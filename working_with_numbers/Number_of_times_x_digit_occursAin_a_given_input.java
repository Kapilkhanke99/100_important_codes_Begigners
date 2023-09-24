package working_with_numbers;

public class Number_of_times_x_digit_occursAin_a_given_input {

	public static int occurance(int num,int x) {
		String d = num + "";
		int count = 0;
		for(int c : d.toCharArray()) {
			//System.out.println(c);

			if(c-'0'==x)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(occurance(133323, 3));
	}
}
