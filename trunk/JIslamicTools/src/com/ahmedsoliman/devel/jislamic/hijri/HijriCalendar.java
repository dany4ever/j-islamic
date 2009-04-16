package com.ahmedsoliman.devel.jislamic.hijri;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class HijriCalendar extends Calendar {

	public final int HIJRI_MONTH = 142930 ;
	public final int HIJRI_DAY = 142931 ;
	
	public HijriCalendar(int day, HijriMonth month, int year) {
		set(year, month.getMonthAsNumber(), day);
	}

	public HijriCalendar(int day, int month, int year) {
		set(year,month,day);
	}

	public HijriCalendar(GregorianCalendar cal) {
	
	}

	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	public HijriMonth getMonth() {
		// return HijriMonth
		return null;
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub

	}

}
