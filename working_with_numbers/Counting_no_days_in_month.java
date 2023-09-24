package working_with_numbers;

public class Counting_no_days_in_month {
	
	public static int days(String month) {
	int days = 0;	
	switch(month) {
	
	case "Janaury" :
		return 31;
	case "February" :
		return 28;
	case "March" :
		return 31;
	case "April" :
		return 30;
	case "May" :
		return 31;
	case "June" :
		return 30;
	case "July" :
		return 31;
	case "August" :
		return 31;
	case "September" :
		return 31;
	case "October" :
		return 30;
	case "NOvember" :
		return 30;
	case "December" :
		return 31;
	default:
		return days;
	}
  }
	public static void main(String[] args) {
		System.out.println(days("Decembe"));
	}
}
