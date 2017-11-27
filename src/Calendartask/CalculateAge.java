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
		
		Date dob=dateFormat.parse("03/11/1994");
		
		
		Calendar dobCalendar =Calendar.getInstance();
		System.out.println("1stdobCalendar "+dobCalendar);
		dobCalendar.setTime(dob);
		System.out.println(dobCalendar);
		 int age = todayCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
		 int day = todayCalendar.get(Calendar.DAY_OF_YEAR) - dobCalendar.get(Calendar.DAY_OF_YEAR);
		 int hours=todayCalendar.get(Calendar.HOUR_OF_DAY) - dobCalendar.get(Calendar.HOUR_OF_DAY);
		 
		 System.out.println("age is :" + age+ "years" +day+"days: "  +hours+"hours");
		

	}

}
