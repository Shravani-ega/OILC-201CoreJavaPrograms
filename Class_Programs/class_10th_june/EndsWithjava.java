package class_10th_june;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class EndsWithjava {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("E:/OILC-201(Shravani Ega)(21222)");

		Files.walkFileTree(path, new ProcessFile());
	}

}

class ProcessFile extends SimpleFileVisitor<Path> {

	public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
		if (file.toString().endsWith(".java")) {
			System.out.println(file);
		}
		return FileVisitResult.CONTINUE;

	}
}
