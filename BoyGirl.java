//**************************************************************
//Method: boyGirl
//This method accepts a Scanner that is reading its input from a
//file containing a series of names followed by integers. The 
//names alternate between boys' names and girls' names. This
//method computes the absolute difference between the sum of the
//boys' integers and the sum of the girls' integers
//Susan Driskill
//February 17, 2020
//Assignment 6: Page 439, Exercise 1
//**************************************************************

//Import the File class
import java.io.*;

//Import the Scanner
import java.util.*;

public class BoyGirl {

	public static void main(String[] args)
			throws FileNotFoundException {
		//Use the file "boysgirls.txt"
		Scanner input = new Scanner(new File("boysgirls.txt"));
		//Test the boyGirl method with the file
		boyGirl(input);
	}

	public static void boyGirl(Scanner input) {
		//Declare and instantiate the variables
		int numOfBoys = 0;
		int sumOfBoys = 0;
		int numOfGirls = 0;
		int sumOfGirls = 0;

		//The file always begins with a boy's name
		
		//Create a while loop to collect all of the information
		
		while (input.hasNext()) {
			//Pass through the boy's name
			input.next();
			//Add 1 to the total number of boys for each boy 
			//listed
			numOfBoys = numOfBoys + 1;
			//Add the integer after each boy's name to the 
			//total sum
			sumOfBoys += input.nextInt();
			
			//In the list, there is a possibility of a boy not 
			//followed by a girl, so create an if statement
			
			if (input.hasNext()) {
				// Pass through the girl's name
				input.next();
				//Add 1 to the total number of girls for each 
				//girl listed
				numOfGirls = numOfGirls + 1;
				//Add the integer after each girl's name to the
				//total sum
				sumOfGirls += input.nextInt();
			} else {
				//Do nothing
			}

		}

		//Declare the variable
		int difference;
		
		//We do not know if the boys' or girls' sum will be 
		//bigger, so we instantiate it depending on the results
		if (sumOfBoys > sumOfGirls) {
			difference = sumOfBoys - sumOfGirls;
		} else {
			difference = sumOfGirls - sumOfBoys;
		}
		
		System.out.println(numOfBoys + " boys, " + numOfGirls + " girls");
		System.out.println("Difference between boys' and girls' sums: " + difference);

	}

}
