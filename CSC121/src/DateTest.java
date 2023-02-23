import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) throws Exception{
		
		Date dt=new Date();
		

	SimpleDateFormat df=new SimpleDateFormat("MM/dd/yy hh:mm");
		Date dt2=df.parse("10/30/22 13:02");
		Date dt3=new Date();
		
		Calendar cal=Calendar.getInstance();
		
		
		
		System.out.println(cal.getTime());
		System.out.println(Calendar.OCTOBER);
		cal.set(Calendar.HOUR, 10);
		System.out.println(cal.getTime());
		

	}

}
