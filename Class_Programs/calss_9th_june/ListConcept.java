package calss_9th_june;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Koushik");
		list.add("Shravani");
		list.add("Srinivas ");
		list.add("Annu");

		list.forEach(p -> System.out.println(p));
	}

}
