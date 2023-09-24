package working_with_numbers;

public class Octal_to_Decimal {
	
	public static void main(String args[])
	{      
		
		int octal = 512;
		//Declare variable to store decimal number  
		int decimal = 0;
		//Declare variable to use in power		
		int n = 0;  
		//writing logic for the conversion
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, n);  
			octal = octal/10;  
			n++;  
		}
		//printing result
		System.out.println("Decimal number : "+decimal); 
		  
	}
	}


