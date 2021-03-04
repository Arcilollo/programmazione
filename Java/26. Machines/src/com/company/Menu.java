package com.company;

public class Menu {

	public static void main(String[] args) {
		Repairshop rs = new Repairshop(10);

		Machine lm = new Lawnmower(1, 177013, 4);
		Machine bc = new Brushcutter(2, 215600, true);

		rs.addMachine(lm);
		rs.addMachine(bc);

		System.out.println(rs.toString());

		rs.repairMachine(215600, 15);

		System.out.println(rs.toString());
	}
}
