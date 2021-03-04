package com.company;

public class Machine {
	protected int orderCode;
	protected int serialCode;

	public Machine (int orderCode, int serialCode) {
		this.orderCode = orderCode;
		this.serialCode = serialCode;
	}

	public int getOrderCode() {
		return orderCode;
	}

	public int getSerialCode() {
		return serialCode;
	}

	public String toString() {
		String msg = "";
		msg += "Numero ordinazione: " + orderCode + "\n";
		msg += "Codice seriale: " + serialCode + "\n";
		return msg;
	}
}
