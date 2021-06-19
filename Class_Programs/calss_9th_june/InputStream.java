package calss_9th_june;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStream {

	public static void main(String[] args) throws Exception {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter your Name ?");
		String name = br.readLine();
		System.out.println("Your name is : " + name);
	}
}
