package class_11th_june;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ListStudents {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("students.dat");
			ObjectInputStream ois = new ObjectInputStream(is);
			while (true) {
				Student s = (Student) ois.readObject();
				System.out.println(s.getSno() + " " + s.getSname() + " " + s.getAge());
			}
		} catch (Exception e) {
			return;
		}
	}
}
