package class_10th_june;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class DataOutputS {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("E://new.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(10);
		dos.writeBoolean(true);
		dos.writeChar('C');
		dos.writeDouble(45.56);
		System.out.println("Done");
		try {

			FileInputStream fis = new FileInputStream("E://new.dat");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readFloat());

		} catch (Exception e) {
			return;
		}
	}

}
