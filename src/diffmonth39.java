import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*Q.39. months between two dates*/

public class diffmonth39 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Calendar c=Calendar.getInstance();
		
		Date d1=sdf.parse("13-12-2020");
		Date d2=sdf.parse("23-08-2020");
		
		c.setTime(d1);
		int m1=c.get(Calendar.MONTH)+1;
		System.out.println(m1);
		int y1=c.get(Calendar.YEAR);
		
		c.setTime(d2);
		int m2=c.get(Calendar.MONTH)+1;
		System.out.println(m2);
		int y2=c.get(Calendar.YEAR);
		
		int Month=(m2-m1);
		System.out.println("Difference between Two dates   "+Month);

	}

}
