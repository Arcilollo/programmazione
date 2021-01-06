package com.company;

public class Club {
	private String clubName;
	private Member members[];
	private int cont = 0;

	public Club (String clubName, int n) {
		this.clubName = clubName;
		members = new Member[n];
	}

	public String getClubName() {
		return clubName;
	}

	public void addMember(Member member) {
		if (cont < members.length) {
			members[cont] = member;
			cont++;
		}
	}

	public String getMemberFee(String memberName) {
		boolean found = false;
		int indexFound = 0;
		String msg = "";
		for (int i = 0; i < cont; i++) {
			if (members[i].getName().equals(memberName)) {
				found = true;
				indexFound = i;
			}
		}

		if (found) {
			int fee = 0;
			if (members[indexFound].isSwimming())
				fee += 25;
			if (members[indexFound].isAerobics())
				fee += 40;
			if (members[indexFound].isBodyBuilding())
				fee += 50;
			msg = "Il membro paga " + fee + " euro\n";
		}
		else {
			msg = "Il membro non esiste\n";
		}

		return msg;
	}

	public String toString() {
		String msg = "Lista dei membri presenti nel circolo:\n";
		for (int i = 0; i < cont; i++) {
			msg += i+1 + ". " + members[i].getName() + "\n";
			if (members[i].isSwimming())
				msg += "Partecipa al circolo di nuoto\n";
			if (members[i].isAerobics())
				msg += "Partecipa al circolo di aerobica\n";
			if (members[i].isBodyBuilding())
				msg += "Partecipa al circolo di body building\n";
			msg += "\n";
		}
		return msg;
	}

}
