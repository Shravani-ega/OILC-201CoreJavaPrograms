package calss_9th_june;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordsCountPath {
	public static void main(String[] args) {
		try {
			String fileName = "C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\calss_9th_june\\Words";
			Path path = Paths.get(fileName);
			List<String> lines = Files.readAllLines(path);
			int count = 0;
			String mobileNos = "\n";

			for (String x : lines) {
				String words[] = x.split(" ");
				for (String w : words) {
					if (w.length() != 0) {

						count++;
					}
				}

			}

			System.out.println("Number of words: " + count);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
