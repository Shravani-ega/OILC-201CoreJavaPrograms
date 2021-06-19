package calss_9th_june;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E://abc.txt");
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\calss_9th_june\\Employee");

		FileOutputStream fos = new FileOutputStream("E://result.txt");
		SequenceInputStream sis = new SequenceInputStream(fis, fis2);

		int k = 0;
		while ((k = sis.read()) != -1) {

			fos.write((char) k);
			System.out.print((char) k);

		}
		sis.close();
		fos.close();
		fis2.close();
		fis.close();
	}

}
