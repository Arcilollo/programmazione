package com.company;

public class Brushcutter extends Machine {
	private boolean isElectric;

	public Brushcutter(int orderCode, int serialCode, boolean isElectric) {
		super(orderCode, serialCode);
		this.isElectric = isElectric;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public String toString() {
		String msg = "";
		msg += "Numero ordinazione: " + orderCode + "\n";
		msg += "Codice seriale: " + serialCode + "\n";
		if (isElectric == true)
			msg += "Accensione elettronica: Si\n";
		else
			msg += "Accensione elettronica: No\n";
		return msg;
	}
}
