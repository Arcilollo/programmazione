package com.company;

public class Member {
	private String name;
	private boolean isSwimming;
	private boolean isAerobics;
	private boolean isBodyBuilding;

	public Member(String name, boolean isSwimming, boolean isAerobics, boolean isBodyBuilding) {
		this.name = name;
		this.isSwimming = isSwimming;
		this.isAerobics = isAerobics;
		this.isBodyBuilding = isBodyBuilding;
	}

	public String getName() {
		return name;
	}

	public boolean isSwimming() {
		return isSwimming;
	}

	public boolean isAerobics() {
		return isAerobics;
	}

	public boolean isBodyBuilding() {
		return isBodyBuilding;
	}

