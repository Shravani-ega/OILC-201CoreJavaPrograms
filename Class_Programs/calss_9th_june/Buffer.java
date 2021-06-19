package calss_9th_june;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffer {

	public static void main(String[] args) {
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
					"C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\class_7th_june\\Demo.java"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E://xyz.txt"));
			int k = 0;
			while ((k = bis.read()) != -1) {

				bos.write((char) k);
				System.out.print((char) k);

			}
			bos.close();
			bis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
