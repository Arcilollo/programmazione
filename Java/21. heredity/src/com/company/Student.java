package com.company;

public class Student extends Person{
	private int mark;
	private int studyHours;

	public Student (String name, String surname, String gender, int age, int mark) {
		super(name, surname, gender, age);
		this.studyHours = 0;
		this.mark = mark;
	}

	public int getStudyHours() {
		return studyHours;
	}

	public void study() {
		this.studyHours++;
	}

	public int getMark() {
		return mark;
	}

	public String toString() {
		String msg = "Il mio nome é: " + getName() + " " + getSurname() + "\n";
		msg += "Ho " + getAge() + " anni\n";
		msg += "Sono " + getGender() + "\n";
		msg += "La mia media é: " + getMark() + "\n";
		msg += "Ho studiato per " + getStudyHours() + " ore\n";
		return msg;
	}
}
