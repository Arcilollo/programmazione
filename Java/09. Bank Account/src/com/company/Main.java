package com.company;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int accountNumber = 177013;
        String man = "Giacomo piacentini";
        int money = 0;

        Account account = new Account(accountNumber, man, money);

        int r;
        do {
            System.out.println("1. Deposita");
            System.out.println("2. Preleva");
            System.out.println("3. Vedi soldi");
            System.out.println("0. Esci");
            r = scan.nextInt();

            int n;
            switch (r) {
                case 1:
                    account.addMoney(scan.nextInt());
                    break;
                case 2:
                    account.removeMoney(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Il tuo saldo è: " + account.getMoney());
                    break;
            }
        } while (r != 0);

    }
}
