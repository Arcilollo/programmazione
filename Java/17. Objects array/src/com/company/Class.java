package com.company;

public class Class {
	private String subject;
	private int cont = 0; // serve ad indicizzare l'array
	private Student[] students;

	public Class(String subject, int nStudents) {
		this.subject = subject;
		this.students = new Student[nStudents];
	}

	public void addStudent(Student s) {
		if (cont < students.length) {
			students[cont] = s;
			cont++;
		}
	}

	public String toString() {
		String msg = "Materia: " + subject + "\n";
		msg += "Studenti nel corso: " + cont + "\n";
		msg += "Studenti massimi: " + students.length + "\n";
		for (int i = 0; i < cont; i++) {
			msg += students[i].getName() + "\t" + students[i].getSurname() + "\t" + students[i].getAge() + "\n";
		}
		return msg;
	}
}
