package calss_9th_june;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreeamTable {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		FileWriter fw = new FileWriter("tables.csv", true);
		System.out.println("Enter a number ?");
		int num = Integer.parseInt(br.readLine());
		String table = "";
		for (int i = 1; i <= 10; i++) {
			table += num + " * " + i + " = " + (num * i) + "\n";
		}
		System.out.println(table);
		fw.write(table);
		fw.flush();
		fw.close();
		br.close();
		ir.close();

	}

}
