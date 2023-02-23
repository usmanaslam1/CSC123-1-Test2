import java.util.Scanner;

public class IntegerParser {

	public static void main(String[] args) {
		
		System.out.println(args.length);
	    
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		
		int a=0;
		
		//The "try" block is where you will execute code that might cause a runtime error under certain circumstances
		
	
		try {
			Object o=s.next();
			a=Integer.parseInt((String)o); //This line can potentially cause runtime error if it tried to convert non-numeric values to a number

		}
		catch(Exception ne) { // The catch block will execute if an error was thrown in the "try" block
			System.out.println("We have an error");
		}
	
		
		System.out.println(a);

		
	}

}
