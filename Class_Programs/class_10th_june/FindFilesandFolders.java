package class_10th_june;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FindFilesandFolders {

	public static void main(String[] args) throws Exception {

		Path path = Paths.get("E:\\Git");
		CountFolder cf = new CountFolder();
		Files.walkFileTree(path, cf);
		System.out.printf("Folders =%d, Files=%d", cf.getFolder(), cf.getFiles());
	}
}

class CountFolder extends SimpleFileVisitor<Path> {
	int folder, files;

	public int getFolder() {
		return folder;
	}

	public int getFiles() {
		return files;
	}

	public FileVisitResult visitFile(Path p, BasicFileAttributes arg) throws IOException {
		files++;
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult preVisitDirectory(Path p, BasicFileAttributes arg) throws IOException {
		folder++;
		return FileVisitResult.CONTINUE;
	}
}
