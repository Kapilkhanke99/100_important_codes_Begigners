package working_with_numbers;

public class Area_of_Circle {
	
	public static double area(int radius) {
		double area = Math.PI*radius*radius;
		//Autoboxing happened
		return area;	
	}
	public static void main(String[] args) {
		System.out.println(area(10));
	}

}
