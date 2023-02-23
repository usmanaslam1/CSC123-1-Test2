public class TestClass {

	private String name="";
	
	
	public static void main(String[] args) throws MyArithmeticException {

			try {
				divide(100,0);
				System.out.println("Done");	
			}
			catch(MyArithmeticException e) {
				System.out.println(e.getMessage());
			}
	}
	

	public static int divide(int x, int y) throws MyArithmeticException {
		
		if(y==0) throw new MyArithmeticException("Division by zero is not allowed");
		return x/y;
		
	}	

}
