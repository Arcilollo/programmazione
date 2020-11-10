package com.company;

public class CD {
	private String[] song = new String[10];
	private int[] time = new int[10];

	public CD(String song[], int time[]) {
		this.song = song;
		this.time = time;
	}

	public void setSong(String name, int n) {
		this.song[n] = name;
	}

	public void setTime(int time, int n) {
		this.time[n] = time;
	}

	public int getTime(String name) {
		int n = 0;
		for (int i = 0; i < 10; i++) {
			if (this.song[i] == name) {
				n = i;
			}
		}

		return time[n];
	}
}
