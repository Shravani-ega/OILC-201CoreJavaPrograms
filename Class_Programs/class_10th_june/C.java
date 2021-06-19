package class_10th_june;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class C {

	public static void main(String[] args) {
		Path sourceFile = Paths.get("E://abc.txt");
		Path targetFile = Paths.get("E://abc2.txt");
		try {
			Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);

			System.out.println("Done");

		} catch (Exception e) {
			System.err.format(" I/o Error When copying file");
		}
	}
}
