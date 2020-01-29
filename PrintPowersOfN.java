//assignment 3: page 195, exercise 3
public class PrintPowersOfN {

	public static void main(String[] args) { 
		//testing 2 to the power of 7
		printPowersOfN(2,7); //correct results: 1 2 4 8 16 32 63 128
		//print blank line for clarity
		System.out.println();
		//testing 5 to the power of 3
		printPowersOfN(5,3); //corrects results: 1 5 25 125
		
	}

	//this program outputs the powers of a base number from 0 through an exponent
	public static void printPowersOfN(int x, int y) { //the base is int x, and the exponent is int y
		//start the output list with 1 because of the rule of the power of 0
		int product = 1;
		//output each power of the base until reaching 1 above the exponent, to include that number
		for (int i = 0; i < y + 1; i++) {
			//output products as a list with a space in between for clarity
			System.out.print(product + " ");
			//after 1, continue to multiply the number by itself until reaching the exponent
			product = product * x;
			
		}

	}

}

