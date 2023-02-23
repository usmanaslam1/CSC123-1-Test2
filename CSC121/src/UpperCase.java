
/**
 * Reference solution to convert string to Upper Case using a character array
 * 
 * @author Usman Aslam
 *
 */
public class UpperCase {

	public static void main(String[] args) {
		
		//Declare a string 
		String s = "Hello World!!";

		//extract character array from the string 
		char[] ca = s.toCharArray();
		
		//create an empty array of the same length as original array
		char[] cu = new char[ca.length];

		int x = 0;

		while (x < ca.length) {
			//pick one character from the character array
			char c = ca[x];
			
			//check if the character is a lower case character 
			if(c<='z'&&c>='a') {
				int c_number=(int)c; //covert character to integer value
				c_number-=32; //subtract 32 from the number (refer to ASCII character set slide)	
				c=(char)c_number; // convert integer back to character
			}
			//add character to output array
			cu[x]=c;		
			x++;

		}
		
		//Create a new String object from the output array, this should have all upercase characters
		String s2=new String(cu);
		System.out.println(s2);

	}

}
