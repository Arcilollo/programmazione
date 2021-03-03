import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
        	String name2;
        	int numAccount;
        	int numAccount2;
        	int amount;
        	int amount2;

        	int n;

        	System.out.println("----------CONTO NUMERO 1----------");
        	System.out.println("Inserisci il nome: ");
        	name = scanner.nextLine();
        	System.out.println("Inserisci il numero dell'account: ");
        	numAccount = scanner.nextInt();
        	System.out.println("Inseirsci il saldo attuale: ");
        	amount = scanner.nextInt();

        	System.out.println("----------CONTO NUMERO 2----------");
        	System.out.println("Inserisci il nome: ");
        	name2 = scanner.nextLine();
        	System.out.println("Inserisci il numero dell'account: ");
        	numAccount2 = scanner.nextInt();
        	System.out.println("Inseirsci il saldo attuale: ");
        	amount2 = scanner.nextInt();
	}

}
