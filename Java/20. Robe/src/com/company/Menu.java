package com.company;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Inserisci il nome del circolo: ");
        String clubName = scan.next();
        System.out.print("Inserisci il numero massimo di membri: ");
        int maxMembers = scan.nextInt();

        Club club = new Club(clubName, maxMembers);

        int r;
        do {
            System.out.println("1. Inserisci membro nel circolo");
            System.out.println("2. Visualizza retta mensile di un membro");
            System.out.println("3. Visualizza lista membri");
            System.out.println("0. Esci");
            r = scan.nextInt();

            switch (r) {
                case 1:
                    System.out.print("Inserisci nome del nuovo membro: ");
                    String memberName = scan.next();
                    System.out.print("Scrivi \"true\" se il membro fa parte del club di nuoto, altrimenti scrivi \"false\": ");
                    boolean memberSwimming = scan.nextBoolean();
                    System.out.print("Scrivi \"true\" se il membro fa parte del club di aerobica, altrimenti scrivi \"false\": ");
                    boolean memberAerobics = scan.nextBoolean();
                    System.out.print("Scrivi \"true\" se il membro fa parte del club di body building, altrimenti scrivi \"false\": ");
                    boolean memberBodyBuilding = scan.nextBoolean();


                    club.addMember(new Member(memberName, new Disciplina(memberSwimming, memberAerobics, memberBodyBuilding)));
                    break;
                case 2:
                    System.out.print("Inserisci il nome del membro del quale vuoi visualizzare la retta mensile: ");
                    String memberName2 = scan.next();
                    System.out.println(club.getMemberFee(memberName2));
                    break;
                case 3:
                    System.out.print(club.toString());
                    break;
            }
        } while(r != 0);
    }
}
