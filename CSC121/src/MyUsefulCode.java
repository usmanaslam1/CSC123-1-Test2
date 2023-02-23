/**
 * CSC 121 - Shared code library. This is to demonstrate  how methods can be written for reuse
 * 
 * @author Usman Aslam
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyUsefulCode {

	
	/**
	* Adds two integers  
	*
	* @param  a  Input integer a
	* @param  b  Input integer b
	* @return      Sum of the two input integers
	*/

	public static int add(int a, int b) {
		return a+b;

	}
	
	/**
	* Checks if the given integers are equal  
	*
	* @param  a  Input integer a
	* @param  b  Input integer b
	* @return      true if integers are equal, else false
	*/

	public static boolean isEqual(int a, int b) {
		return a==b;

	}
	/**
	* Reads integer input from user between a given range. Handles number format errors
	* and invalid input errors  
	*
	* @param  inputString  The message to be displayed to user when asking for input
	* @param  min  Minimum value for the acceptable input range
	* @param  max  Maximum value for the acceptable input range
	* @return      The input entered by the user
	*/
	
	public static int readIntFromUser(String inputString) {
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(inputString + ":");
				return s.nextInt();
			} catch (Exception e) {
				System.out.println("\nEnter a valid number\n");
				s.next();
			}
		}

	}

	/**
	* Reads a given text file into an ArrayList of Strings. Returns null if the file could not be read   
	*
	* @param  fileName  File name to be read 
	* @return    Lines from the text file in an ArrayList
	* @see  ArrayList
	*/

	public static ArrayList<String> readFile(String fileName) {
		// Create a file object to read from
		File sourceFile = new File(fileName);
		ArrayList<String> output=new ArrayList<String>();				
				
		try {
			if (!sourceFile.exists()) return null;
			
			// File reader
			Scanner reader = new Scanner(sourceFile);

			while (reader.hasNext()) {
				output.add(reader.nextLine());
			}
		} catch (FileNotFoundException fne) {
			return null;
		} 

		return output;
	}

	/**
	* Reads a given text file into a String. Returns null if the file could not be read   
	*
	* @param  fileName  File name to be read 
	* @return    String containing entire content of the file
	*/

	public static String readFileIntoString(String fileName) {
		ArrayList<String> list=readFile(fileName);
		if(list==null) return null;
		
		String out="";
		for(String item:list) {
			out+=item+" ";
		}
		return out;
 	}
	
	/**
	* Returns total number of words in a String  
	*
	* @param  s Input String
	* @return   Total number of words, return -1 if input String is null
	*/

	public static int countWords(String s) {
		if(s==null)return -1;
		return s.split(" ").length;
 	}
	public static char shift(char c, int n) {
		return (char)(c+n);
 	}
	
	
	
	
}
