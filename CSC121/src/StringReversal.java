
public class StringReversal {
	public static void main(String[] args) {
		
		String s="Hello World!!";
		

		//************ String reversal code starts here ***********/
		//Input array
		char[] ca=s.toCharArray();
		//Output array
		char[] ci=new char[ca.length];
		
		int x=0;
		while(x<ca.length) {
			int backwardCounter=ca.length-(x+1);//This should start with end of the input array and count backwards
			char c=ca[backwardCounter]; //Pick characters one-by-one from end-to-start from the input array
			//Add characters from start-to-end in the output array i.e. reversing the input
			ci[x]=c;
			x++;
		}
		
		//Construct and print String based on output array
		String s2=new String(ci);
		
		//*************************8
	
		
		
		System.out.println(s2);
	}
}
