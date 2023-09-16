package $27_baisc_codes_on_Numbers;

public class Fibonacci_series {
	
	public static int[] fib(int num) {
		int a = 0,b = 1;
		int arr[]= new int[num];
		arr[0]=a;
		arr[1]=b;
		//System.out.print(a+","+b+",");
		int next;
		for(int i=2;i<num;i++) {
			next = a+b;
			a=b;
			b=next;
			arr[i]=next;
			//System.out.print(next+",");
		}
		return arr;
	}
	 public static void main(String[] args) {
	        int num = 5;
	        int[] fibonacciSeries = fib(num);
	        
	        System.out.print("Fibonacci Series up to " + num + " terms: ");
	        for (int i = 0; i < num; i++) {
	            System.out.print(fibonacciSeries[i] + " ");
	        }
	    }

}
