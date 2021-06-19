package calss_9th_june;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class WordsCountInFile {
	public static void main(String[] args) {
		try {
			FileReader fis = new FileReader(
					"C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\calss_9th_june\\Words");
			BufferedReader br = new BufferedReader(fis);
			int count = 0;
			while (true) {

				String line = br.readLine();
				if (line == null) {
					break;
				} else {
					String words[] = line.split(" ");

					for (String w : words) {

						if (w.length() != 0) {
							count++;
						}
					}
				}
			}
			System.out.println("Number of words = " + count);
			br.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
