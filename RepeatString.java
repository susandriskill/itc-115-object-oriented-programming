//****************
//method: repl
//this method accepts a string and a number of
//repetitions as parameters and returns the string
//concatenated that many times
//susan driskill
//february 3, 2020
//assignment 4: page 314, exercise 2
//****************

public class RepeatString {

	public static void main(String[] args) {
		//testing the repl method
		//parameters: string and number of 
		//repetitions
		System.out.println(repl("hello", 3));
		System.out.println(repl("hello", 0));
		System.out.println(repl("hello", -3));
		System.out.println(repl("hello", 8));

	}

	public static String repl(String str1, 
			int count) {
		// create an empty string to hold the new 
		//value
		String str2 = "";

		//add to the string per the number of 
		//repetitions
		if (count > 0) {
			for (int i = 1; i <= count; i++) {
				str2 = str2 + str1;

			}
		} else {
			// do nothing- return an empty string
		}

		// return the string
		return str2;

	}

}