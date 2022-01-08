package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);

		d = cal.getTime();
		System.out.println(sdf.format(d));

		System.out.println("-----------");

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date f = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf1.format(f));
		
		Calendar cale = Calendar.getInstance();
		cale.setTime(f);
		
		int minutes = cale.get(Calendar.MINUTE);
		int month = 1 + cale.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
