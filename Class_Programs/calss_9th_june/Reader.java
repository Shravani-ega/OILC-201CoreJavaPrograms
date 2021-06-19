package calss_9th_june;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Reader {
	public static void main(String[] args) {
		try {
			FileReader fis = new FileReader(
					"C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\class_7th_june\\Demo.java");
			FileWriter fos = new FileWriter("E:\\abc2.txt");
			int k = 0;
			while ((k = fis.read()) != -1) {

				fos.write((char) k);
				System.out.print((char) k);

			}
			fos.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
