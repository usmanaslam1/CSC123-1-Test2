
/**
 * Reference solution to find biggest number in an array
 * 
 */
import java.util.Scanner;

public class ArrayIteration {
	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 5, 7 }, { 1, 2, 3, 5, 7 }, { 1, 2, 3, 5, 7 }, { 1, 2, 3, 5, 7 },
				{ 1, 2, 3, 5, 7 } };

		int[][] twoDimArray = new int[6][3];
		twoDimArray[0][0] = 1;
		twoDimArray[0][1] = 2;

		for (int[] innerArray : array) {
			for (int x : innerArray) {
				System.out.println(x);
			}
		}
		
		System.out.println("hello");

	}
}