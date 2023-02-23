/**
 * Reference solution to find biggest number in an array
 * 
 */
import java.util.Scanner;
public class Lab1Q1{
	public static void main(String[] args){
		
	final int TOTAL_VALUES=5;
	
	
	
	int[] userInput = new int[TOTAL_VALUES];
	byte counter = 0;
	int total = 0;
	Scanner keyboard = new Scanner(System.in);

	while(counter < TOTAL_VALUES)
	{
		System.out.print("Enter a number " + (counter+1) + " :");
		userInput[counter] = keyboard.nextInt();
		counter++;
		
	}
	counter = 0;
	int biggestNumber=0;
	
	while(counter < TOTAL_VALUES){
		total += userInput[counter];
		
		//check for the biggest number
		if(userInput[counter]>biggestNumber) {
			biggestNumber=userInput[counter];
		}
		
		
		++counter;
	}
	System.out.print("The result is: " + total);
	System.out.print("Biggest Number is: " + biggestNumber);
	


}
}