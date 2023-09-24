package working_with_numbers;

public class count_decoding_of_digit_sequence {
	
	 public static int countDecodings(int digits) {
	        int count = 1;
	        while(digits>9) {
	        	int rem = digits%100;
	        	if(rem <= 26) {
	        		count++;
	        	}
	        	digits /= 10;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int digits = 1111;
	        int result = countDecodings(digits);
	        System.out.println("Total possible decodings: " + result);
	    }
	
	}	
	


