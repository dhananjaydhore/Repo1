package utiliteis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public static void main(String[] args) {
//		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MM yyyy HH:mm:ss", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMM yyyy", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMMM yyyy", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("dd/MM/yyyy", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("yyyyy.MMMMM.dd GGG hh:mm aaa", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("EEE, d MMM yyyy HH:mm:ss Z", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("hh 'o''clock' a, zzzz", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", 4));
//		System.out.println(getRequiredDateBasedOnNumberOfDays("yyyyy.MMMMM.dd GGG hh:mm aaa", 4));
		System.out.println(getRequiredDateBasedOnNumberOfYear("dd MMM yyyy", 2));
		System.out.println(getRequiredDateBasedOnNumberOfMonth("dd MMM yyyy" , 3));

	}
	
//	public static String getRequiredDateBasedOnNumberOfDays(String format, int numberOfdays) {
//		Calendar cal=Calendar.getInstance();
//		cal.add(cal.DATE, numberOfdays);
//		SimpleDateFormat s=new SimpleDateFormat(format);
//		return s.format(new Date(cal.getTimeInMillis()));
//	}
	public static String getRequiredDateBasedOnNumberOfDays(String format, int numberOfDays) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnNumberOfYear(String format, int numberOfYear) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, numberOfYear);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnNumberOfMonth(String format, int numberOfMonth) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, numberOfMonth);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}

}
