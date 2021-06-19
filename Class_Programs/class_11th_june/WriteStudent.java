package class_11th_june;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class WriteStudent {
	public static void main(String[] args) {
		OutputStream is;
		ObjectOutputStream ois;
		try {
			is = new FileOutputStream("students.dat");
			ois = new ObjectOutputStream(is);
			Student s1 = new Student(1, "Shravani", 24);
			Student s2 = new Student(2, "Srinivas", 30);
			Student s3 = new Student(3, "Koushik Raj", 6);
			Student s4 = new Student(4, "Sravanthi", 22);
			Student s5 = new Student(5, "Nirmala", 40);

			ois.writeObject(s1);
			ois.writeObject(s2);
			ois.writeObject(s3);
			ois.writeObject(s4);
			ois.writeObject(s5);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
