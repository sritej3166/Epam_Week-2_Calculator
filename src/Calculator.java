
import java.util.Scanner;

public class Calculator
{
    public float calculator_func(char choice) throws ArithmeticException 
    {
        float a,b;
        float res = 0;
        Scanner scan = new Scanner(System.in);
        switch(choice)
            {
                case '1' : 
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a + b;
                    break;
                case '2' : 
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a - b;
                    break;
                case '3' :
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a * b;
                    break;
                case '4' :
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    if(b==0) {
                    		    scan.close();
                    			throw new ArithmeticException("Divide by zero error");
                    		 }
                    else {
                    		res = a / b;
                    	 }
                    break;
                case '5' : System.exit(1);
                default : System.out.print("Wrong input");
                		  break;
                		  
            }     
        return res;
    }
}
