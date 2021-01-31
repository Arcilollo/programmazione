package com.company;

public class Disciplina {
	private boolean swimming;
	private boolean aerobics;
	private boolean bodyBuilding;

	public Disciplina (boolean swimming, boolean aerobics, boolean bodyBuilding) {
		this.swimming = swimming;
		this.aerobics = aerobics;
		this.bodyBuilding = bodyBuilding;
	}

	public boolean isSwimming() {
		return swimming;
	}

	public boolean isAerobics() {
		return aerobics;
	}

	public boolean isBodyBuilding() {
		return bodyBuilding;
	}
}
