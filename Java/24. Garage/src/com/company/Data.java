package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {

	private GregorianCalendar c;

	public Data(){
		c = new GregorianCalendar();
	}

	public Data(int g, int m, int a){
		c = new GregorianCalendar(a,m-1,g);
	}

	public int getDifference(Data d){
		int diff=0;
		long cm = c.getTimeInMillis();
		long dm = d.c.getTimeInMillis();
		long diffm = cm - dm;
		diff = (int) (diffm / (24 * 60 * 60 * 1000));
		return diff;
	}

	public int getDay() {
		return c.get(Calendar.DATE);
	}

	public int getMonth() {
		 return c.get(Calendar.MONTH) + 1;
	}

	public int getYear() {
		return c.get(Calendar.YEAR);
	}

	public boolean equals(Object obj){
		if(obj == null) return false;

		if(!(obj instanceof Data)) return false;

		return c.equals((GregorianCalendar)obj);

	}

	public void nextDay() {
		c.add(c.DAY_OF_YEAR, 1);
	}

	public String toString(){
		int anno = c.get(Calendar.YEAR);
		int mese = c.get(Calendar.MONTH) + 1;
		int giorno = c.get(Calendar.DATE);
		return giorno+"/"+mese+"/"+anno;
	}

}
