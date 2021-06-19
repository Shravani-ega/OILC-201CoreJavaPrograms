package collectionsDate_19thJune;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DatesDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		long l = System.currentTimeMillis();
		java.sql.Date d1 = new java.sql.Date(l);
		System.out.println(d1);

		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate yesterday = date.minusDays(1);
		System.out.println(yesterday);

		LocalDate tomorrow = date.plusDays(1);
		System.out.println(tomorrow);

		Calendar c = Calendar.getInstance();
		Date dd = c.getTime();
		System.out.println(dd);
		c.add(Calendar.DATE, -15);
		System.out.println("15 days ago " + c.getTime());

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DATE));

	}

}
