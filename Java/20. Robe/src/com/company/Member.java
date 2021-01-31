package com.company;

public class Member {
	private String name;
	private Disciplina disciplina;

	public Member(String name, Disciplina disciplina) {
		this.name = name;
		this.disciplina = disciplina;
	}

	public String getName() {
		return name;
	}

	public boolean isSwimming() {
		return disciplina.isSwimming();
	}

	public boolean isAerobics() {
		return disciplina.isAerobics();
	}

	public boolean isBodyBuilding() {
		return disciplina.isBodyBuilding();
	}
}
