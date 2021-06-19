package collectionsDate_19thJune;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date date = s.parse("19-06-2021");
		System.out.println(date);
	}
}