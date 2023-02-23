/**
 * Input validation using while loop
 * @author Usman Aslam
 * 
 */
import java.util.Scanner;

public class InputValidation {
	
public static void main(String[] args) {
		
		int a=-1;
		Scanner s =new Scanner(System.in);
		
		while(true) {

			System.out.print("Enter Value:");
			a=s.nextInt();			
			if(a<0)
				System.out.println("\nTry gain!! \n");
			else 
				break;
					
		}
	}

}
