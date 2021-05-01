package com.te.factorymethod_demo;

public abstract class Plan {
	
	double rate;
	abstract public void setRate();
	
	public void calculateBill(int units) {
		 rate  = rate*units;
		System.out.println(rate);
	}

}
