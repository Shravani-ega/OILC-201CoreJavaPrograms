package calss_9th_june;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MobileNumbers {
	public static void main(String[] args) {
		try {
			String fileName = "C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\calss_9th_june\\MibliesNumbers";
			Path path = Paths.get(fileName);
			List<String> lines = Files.readAllLines(path);
			int count = 0;
			String mobileNos = "\n";

			for (String x : lines) {
				String words[] = x.split(" ");
				if (words[1].length() == 10) {
					mobileNos += words[1] + "\n";
				}

			}

			System.out.println("Mobiles nos : " + mobileNos);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
