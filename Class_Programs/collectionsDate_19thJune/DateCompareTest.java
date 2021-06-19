package collectionsDate_19thJune;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompareTest {
	static String compareDates(String date1, String date2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		String res = "";
		Date d1 = (Date) sdf.parse(date1);
		Date d2 = (Date) sdf.parse(date2);
		if (d1.compareTo(d2) > 0) {
			res += "1";
		} else if (d2.compareTo(d2) < 0) {
			res += "2";
		} else if (d1.equals(d2)) {
			res += "0";
		} else {
			res += "-1";
		}
		return res;
	}

	public static void main(String args[]) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date1 in formart dd-mm-yyyy");
		String date1 = sc.next();
		System.out.println("Enter date2 in formart dd-mm-yyyy");
		String date2 = sc.next();
		System.out.println(compareDates(date1, date2));
	}
}