package working_with_numbers;

public class Finding_Roots_of_a_quadratic_equation {

	public static String roots(int a,int b,int c) {
		double discriminant = b*b-4*a*c;
		if(discriminant>0) {
			double root1 = (-b + Math.sqrt(discriminant))/2*a;
			double root2 = (-b - Math.sqrt(discriminant))/2*a;
			return "Two real Roots "+root1+" and "+root2;
		}
		else if(discriminant==0) {
			double root1 = -b/2*a;
			return "One real root " + root1;
		}
		else
			return "No real roots for the equation";
	}
	public static void main(String[] args) {
		System.out.println(roots(1, 4, 3));
	}
}
