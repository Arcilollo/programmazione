package com.company;

public class GasStation {
	private Tank tank;
	private float costL;

	public GasStation(Tank serbatoio, float costoL) {
		this.tank = serbatoio;
		this.costL = costoL;
	}

	public float getCostL() {
		return costL;
	}

	public void rifornisciVeicolo(int litri) {
		litri = litri * -1;
		this.tank.addLitri(litri);
	}

	public String toString() {
		String msg = "Litri disponibili: " + tank.getLitri() + "\n";
		msg += "euro per litro: " + costL + "\n";
		return msg;
	}
}
