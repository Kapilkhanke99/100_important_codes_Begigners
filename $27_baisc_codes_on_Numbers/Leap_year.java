package $27_baisc_codes_on_Numbers;

public class Leap_year {
	
	public static boolean leap(int year) {
		if(year%400==0||year%4==0&&year%100!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(leap(2000));
	}

}
