package javaPractice;

import java.util.Scanner;

public class SampleCalculators {



	
	public double Add(double a, double b)
	{
	    double sum = a+b;
		System.out.println(sum);
	    return sum;
	}
    public double sub(double a, double b)
    {
    	double sub = a-b; 
		 System.out.println(sub);
    	return sub;
    }
    public double multi(double a, double b)
    {
    	double multi = a*b; 
    	System.out.println(multi);
    	return multi; 
    }
    public double divide(double a, double b)
    {
    	double divide = a/b; 
    	System.out.println(divide);
    	return divide; 
    }
	
    
	
	public static void main(String[] args)
	{
		
		String add = null, sub = null, multi = null, div = null;
		SampleCalculators a = new SampleCalculators(); 
		
		System.out.println("Enter the operations to perform: ");
		System.out.println("Enter add, sub, multi or div: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
    	switch(input) {
    	case "add":
    		a.Add(20, 30);
            break;
    	case "sub":
    		a.sub(40, 20);
    		break;
    	case "multi":
    		a.multi(45, 25);
    		break;
    	case "div":
    		a.divide(34, 20);
    		 break;
    	default:
            System.out.println("Invalid operations are entered");
            return;
    		
    	}
    	
		
	}
	
}
