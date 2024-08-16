// Java program to Sort a String Alphabetically
// Using toCharArray() method
// With using the sort() method

import java.util.Arrays;

class ReverseLetterWord {

	// To sort a string alphabetically
	public static String sortString(String inputString)
	{
		// Converting input string to character array
		char tempArray[] = inputString.toCharArray();

		// Sorting temp array using
		Arrays.sort(tempArray);

		// Returning new sorted string
		return new String(tempArray);
	}

	public static void main(String[] args)
	{
		// Custom string as input
		String inputString = "geeks for geeks is your abc";
        
		String stArr[] = inputString.split("\\ ");

		// Print and display commands
        for (int i = 0; i < stArr.length; i++) {
            String outputString = sortString(stArr[i]);
            System.out.print(outputString + " ");
        }
		
	}
}
