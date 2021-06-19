package class_10th_june;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("E://abc.txt", "rw");
		for (int i = 1; i <= 10; i++) {

			raf.writeDouble(1.5 * i);
		}
		raf.seek(0);
		for (int i = 1; i <= 10; i++) {
			System.out.println(raf.readDouble());
		}
		raf.seek(4 * 8);
		System.out.println("5th record  " + raf.readDouble());
		System.out.println("Current cursor position =" + raf.getFilePointer());
		raf.seek(7 * 8);
		System.out.println("8th record  " + raf.readDouble());
		System.out.println("Current cursor position =" + raf.getFilePointer());
	}
}
