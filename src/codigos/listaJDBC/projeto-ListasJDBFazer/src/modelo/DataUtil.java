package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {
	public static Calendar stringToCalendar(String s) {
		Calendar dataCalendar = null;
		try {
			dataCalendar = Calendar.getInstance();
			Date dataUtil = new SimpleDateFormat("dd/MM/yyyy").parse(s);
			dataCalendar.setTime(dataUtil);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dataCalendar;
	}
	
	public static java.sql.Date calendarToSqlDate(Calendar cal){
		return new java.sql.Date(cal.getTimeInMillis());
	}
	
	public static Calendar sqlDateToCalendar(java.sql.Date dataSql) {
		Calendar dataCalendar = Calendar.getInstance();
		dataCalendar.setTime(dataSql);
		return dataCalendar;
	}
	
	public static String calendarToString(Calendar c) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(c.getTime());
	}
}
