package working_with_numbers;

public class Quadrant_where_coordinate_lies {
	
	public static String qwcl(double x, double y) {
		
		if(x==0&&y==0)
			return "Point lies on origin";
		else if((x>0||x<0)&&y==0)
			return "Point lies on x axis";
		else if(x==0&&y>0||y<0)
			return "Point lies on y axis";
		else if(x>0&&y>0)
			return "Point lies on first quadrant";
		else if(x<0&&y>0)
			return "Point lies on second quadrant";
		else if(x>0&&y<0)
			return "Point lies on third quadrant";
		else
			return "Point lies on fourth quadrant";
	}
	public static void main(String[] args) {
		System.out.println(qwcl(6, 8));
	}

}
