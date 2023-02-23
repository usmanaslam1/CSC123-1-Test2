import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) throws Exception {
		int[] numbers = { 100,99, 101, 1, 3, 7,501, 2};
		
		numbers[0]=101;
		
		ArrayList<Integer> numbers2=new ArrayList<Integer>();
		numbers2.add(100);
		numbers2.add(99);
		numbers2.add(101);
		numbers2.add(1);

		System.out.println(numbers2);
		Collections.sort(numbers2);
		System.out.println(numbers2);
		
		
		

		
		
		
		
		
		
		
		
		

		numbers = sort(numbers);
		//for (int number : numbers)
		//	System.out.println(number);
		
		
		
		

	}

	public static int[] sort(int[] input) throws ArrayEmptyException {

		if (input.length == 0)
			throw new ArrayEmptyException();
		
		boolean swapped=false;
		
		while (true) {
			swapped=false;
			for (int x = 0; x < input.length - 1; x++) {
				if (input[x] > input[x + 1]) {
					int tmp = input[x];
					input[x] = input[x + 1];
					input[x + 1] = tmp;
					swapped=true;
				}
			}
			
			if(!swapped)break;
		}

		return input;

	}

}
