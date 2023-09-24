package working_with_numbers;

public class Convert_digit_or_numbers_to_words {
	
	
        static final String[] units = {
	        "", "Thousand", "Million", "Billion"
	    };

	    static final String[] belowTwenty = {
	        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	    };

	    static final String[] tens = {
	        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };

	    public static String convertToWords(int num) {
	        if (num == 0) {
	            return "Zero";
	        }

	        StringBuilder words = new StringBuilder();
	        int unitIndex = 0;

	        while (num > 0) {
	            if (num % 1000 != 0) {
	                StringBuilder currentWords = new StringBuilder();

	                int part = num % 1000;
	                if (part >= 100) {
	                    currentWords.append(belowTwenty[part / 100]).append(" Hundred ");
	                    part %= 100;
	                }

	                if (part >= 20) {
	                    currentWords.append(tens[part / 10]).append(" ");
	                    part %= 10;
	                }

	                if (part > 0) {
	                    currentWords.append(belowTwenty[part]).append(" ");
	                }

	                currentWords.append(units[unitIndex]);
	                words.insert(0, currentWords);
	            }

	            num /= 1000;
	            unitIndex++;
	        }

	        return words.toString().trim();
	    }

	    public static void main(String[] args) {
	        int number = 123456789;
	        String words = convertToWords(number);
	        System.out.println(number + " in words is: " + words);
	    }
	}



