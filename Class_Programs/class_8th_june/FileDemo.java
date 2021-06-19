package class_8th_june;

import java.io.File;

public class FileDemo {

	static void dispFiles(String dirName) {

		File f = new File(dirName);
		if (f.isDirectory()) {

			String[] list = f.list();
			for (String x : list) {
				String path = dirName + "/" + x;
				File file = new File(path);
				if (file.isDirectory()) {
					dispFiles(path);
				}
				System.out.println(path);
			}
		} else {
			System.out.println("Invalid Directory");
		}
	}

	public static void main(String[] args) {
		dispFiles("C:\\Users\\se21222");
	}
}
