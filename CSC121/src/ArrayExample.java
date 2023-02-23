
public class ArrayExample {

	public static void main(String[] args) {
	
		// Declare an array with max size of 10
		int[] numbers=new int[10];
		
		//Assign values to the array
		numbers[0]=3;
		numbers[1]=4;
		numbers[2]=6;
		numbers[3]=8;
		numbers[4]=9;
		numbers[5]=3;
		numbers[6]=4;
		numbers[7]=6;
		numbers[8]=8;
		numbers[9]=9;	
		
		
		//Loop through the array and print each value
		int x=0;
		
		while(x<numbers.length) {
			System.out.printf("%d\n",numbers[x++]);
			
		}
		
		
		
		
		
	}

}
