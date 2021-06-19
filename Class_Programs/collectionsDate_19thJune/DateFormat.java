package collectionsDate_19thJune;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		String string = s.format(date);
		System.out.println(string);
	}
}
