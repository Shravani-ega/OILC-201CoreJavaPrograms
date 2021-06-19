package calss_9th_june;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFile {

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\calss_9th_june\\MibliesNumbers";

		Path path = Paths.get(fileName);

		Files.lines(path).forEach(x -> dispEmployess(x));

	}

	static void dispEmployess(String line) {

		String parts[] = line.split(",");
		if (parts.length < 2) {
			return;
		}
		System.out.println(parts[0] + " :" + parts[1]);
	}

}
