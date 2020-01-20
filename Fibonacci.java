//assignment 2: page 133, exercise 3
public class Fibonacci {

	//this program outputs the first 12 fibonacci numbers
	public static void main(String[] args) {
		
		//declare variables
		int count = 12;
		//the first number in the fibonacci sequence is 1
		int number1 = 1;
		//the second number in the fibonacci sequence is 1 
		int number2 = 1;
		//print introduction for the program
		System.out.println("This program outputs the first 12 Fibonacci numbers: ");
		
		for (int i = 1; i <= count; i++) {

			//print results of program
			System.out.print (number1 + " ");
			//compute the fibonacci sequence and reassign variables
			int sumOfPreviousNumbers = number1 + number2;
			number1 = number2;
			number2 = sumOfPreviousNumbers;

		}

	}

}
