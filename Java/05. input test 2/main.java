import java.io.*;

public class main {

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader keyboard = new BufferedReader(input);
		int x, y;

		try {
			String erre = keyboard.readLine();
			x = Integer.valueOf(erre).intValue();
		}
		catch(Exception e) {
			return;
		}

		try {
			String erre = keyboard.readLine();
			y = Integer.valueOf(erre).intValue();
		}
		catch(Exception e) {
			return;
		}

		System.out.println(x + y);
	}

}
