import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*21.  Find the number of days between two input dates.*/
public class diffDate21 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		 Calendar c=Calendar.getInstance();
		  Date d1=sdf.parse("11-07-2020");
		  Date d2=sdf.parse("01-07-2020");
		  c.setTime(d1);
		  int dd1=c.get(Calendar.DATE);
		  System.out.println(dd1);
	
		  c.setTime(d2);
		  int dd2=c.get(Calendar.DATE);
		  System.out.println(dd2);
		  
		  int day=(dd1-dd2);
		 
		
		 System.out.println("The Difference between two dates are   "+day + "days");

	}

}
