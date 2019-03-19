import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		Calculator test=new Calculator();
		Scanner scan = new Scanner(System.in);
		char choice;
		float res;
        do {   
        	
        	System.out.print("1.Addition\n");
            System.out.print("2.Subtraction\n");
            System.out.print("3.Multiplication\n");
            System.out.print("4.Division\n");
            System.out.print("5.Exit\n\n");
            System.out.print("Enter Your Choice and then the operands by giving spaces:");
            choice = scan.next().charAt(0);
            res=test.calculator_func(choice);
            System.out.println("The answer is"+res+"\n");
        }
		while(choice!=5);
		scan.close();
		return;
	}
}
