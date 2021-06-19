package class_7th_june;

import java.io.FileInputStream;

public class FileException {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream(
					"C:/Users/se21222/eclipse-workspace/NewProj/src/assign07thMay/NumberOfDigits.java");
			int k = 0;
			while ((k = f.read()) != -1) {
				System.out.println((char) k);
			}

		} catch (

		Exception e) {
			System.out.println(e);
		}
	}
}
