import java.util.Scanner ;

public class Calculator
{

    public static void main(String[] args)
    {
	Scanner keyboard = new Scanner(System.in) ;
	double firstOperand ;
	double secondOperand ;

	System.out.println("Enter first operand:") ;
	firstOperand = keyboard.nextDouble() ;

	System.out.println("Enter second operand:") ;
	secondOperand = keyboard.nextDouble() ;

	System.out.println("Calculator Menu") ;
	System.out.println("---------------") ;
	System.out.println("1. Addition") ;
	System.out.println("2. Subtraction") ;
	System.out.println("3. Multiplication") ;
	System.out.println("4. Division") ;

	System.out.println("Which operation do you want to perform?") ;

	int userInput ; //integer rather than double bc 4 choices represented as whole numbers
        userInput = keyboard.nextInt() ;

        double calcResponse ; //response must be double to keep in line with original double inputs before calculation
		if (userInput == 1)
		{
			calcResponse = firstOperand + secondOperand ;

			System.out.println("The result of the operation is " + calcResponse + ". Goodbye!") ;
		}
		else if (userInput == 2)  //if else chaining allows for responses to multiple options
		{
			calcResponse = firstOperand - secondOperand ;

			System.out.println("The result of the operation is " + calcResponse + ". Goodbye!") ;
		}
		else if (userInput == 3)
		{
			calcResponse = firstOperand * secondOperand ;

			System.out.println("The result of the operation is " + calcResponse + ". Goodbye!") ;
		}
		else if (userInput == 4)
		{
			calcResponse = firstOperand / secondOperand ;

			System.out.println("The result of the operation is " + calcResponse + ". Goodbye!") ;
		}
		else
		{
			System.out.print("Error: Invalid selection! Terminating program.") ;
		}
    }
}
