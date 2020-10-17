import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n, number;
		int sump = 0, sumd = 0;
		int pair = 0, disp = 0;

		System.out.println("Inserisci il numero degli elementi da inserire:");
		n = scan.nextInt();

		System.out.println("Inserisci i " + n + " Numeri:");

		for (int i = 0; i < n; i++) {
			number = scan.nextInt();

			if (number % 2 == 0) {
				pair++;
				sump += number;
			}
			else {
				disp++;
				sumd += number;
			}
		}

		if (pair != 0) {
			System.out.println("\nNumeri pari inseriti : " + pair);
			System.out.println("Media numeri pari: " + sump / pair);
		}
		if (disp != 0) {
			System.out.println("\nNumeri dispari inseriti : " + disp);
			System.out.println("Media numeri dispari: " + sumd / disp);
		}

	}

}
