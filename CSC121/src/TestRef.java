import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRef {

	public static void main(String[] args) throws Exception {
		

		SimpleDateFormat df=new SimpleDateFormat("MM/dd/yy");
		df.setLenient(true);
		Date d=df.parse("11/35/2022");		
		System.out.println(df.format(d));

		

	}

}
