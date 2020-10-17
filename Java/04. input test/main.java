import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;

		System.out.println("inserisci il primo numero");
		x = scan.nextInt();
		System.out.println("inserisci il secondo numero");
		y = scan.nextInt();

		int sum = x + y;
		System.out.println(sum);
	}
}
