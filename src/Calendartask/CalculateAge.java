package Calendartask;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateAge {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		Calendar todayCalendar = Calendar.getInstance();
		System.out.println("todaycalendar "+todayCalendar);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(dateFormat);
		
		Date dob=dateFormat.parse("03/11/1560");
		
		
		Calendar dobCalendar =Calendar.getInstance();
		System.out.println("1stdobCalendar "+dobCalendar);
		dobCalendar.setTime(dob);
		System.out.println(dobCalendar);
		 int age = todayCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
		 
		 System.out.println("age is :" + age);
		

	}

}
