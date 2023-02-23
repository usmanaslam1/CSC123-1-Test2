/**
 * Reference solution to find biggest number in an array
 * 
 */
import java.util.Scanner;
public class DWLoop{
	public static void main(String[] args){
		
	int input=0;
	Scanner keyboard=new Scanner(System.in);
	
	do
	{
		System.out.print("Enter a number :");
		input = keyboard.nextInt();
		
	}while(input<=0);

	
	for(int x=0;x<input;x+=2) {
		
		System.out.println("Number: "+x);
	}
	
	


}
}