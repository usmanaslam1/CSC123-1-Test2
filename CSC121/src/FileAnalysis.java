import java.io.File;
import java.util.Scanner;

public class FileAnalysis {

	public static void main(String[] args) throws Exception {
		
		int characters=0;
		int words=0;
		int alpha=0;
		int space=0;
		int numbers=0;
		
		//String input="Hello can I have 20 389578 candles please, now";
		
		//String input=MyUsefulCode.readFileIntoString(args[0]);
		
		String input="";
		
		File inputFile=new File("/Users/usman/csc121.txt");
		
		Scanner fileReader=new Scanner(inputFile);
		
		while(fileReader.hasNextLine()) {
			input=input+" "+fileReader.nextLine();
		}
	
			
		if(input==null)System.exit(0);
		
		characters=input.length();
		String[] pieces=input.split(" ");
		char[] allCharacters=input.toCharArray();
		words=pieces.length;
		
		for(char c: allCharacters) {
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			if(c==' ') {
				space++;
			}
			if(Character.isDigit(c)) {
				numbers++;
			}
		}
		
		
		System.out.printf("%d Characters%n",characters);
		System.out.printf("%d Words%n",words);
		System.out.printf("%d Alphabets%n",alpha);
		System.out.printf("%d Spaces%n",space);
		System.out.printf("%d Numbers%n",numbers);
		

	}

}
