package class_8th_june;

import java.io.File;

public class DispAllFiles {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\se21222");
		if (f.isFile()) {
			System.out.println("It is file");
		} else {
			System.out.println("Not a file");
		}
	}

}
