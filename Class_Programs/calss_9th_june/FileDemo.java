package calss_9th_june;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\class_7th_june\\Demo.java");
			FileOutputStream fos = new FileOutputStream("E:\\abc.txt");
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
