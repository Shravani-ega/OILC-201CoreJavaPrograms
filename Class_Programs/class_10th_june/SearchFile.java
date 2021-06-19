package class_10th_june;

import java.io.File;
import java.io.FileNotFoundException;

public class SearchFile {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\class_7th_june");
		if (f.isDirectory()) {

			String[] list = f.list();
			for (String l : list) {

				if (l.endsWith(".java")) {
					System.out.println(l);
				}
			}
		}
	}
}