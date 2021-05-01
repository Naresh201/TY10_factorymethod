package com.te.factorymethod_demo;

import java.util.Scanner;

public class TestBilling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your plan type: ");
		   String plantype = scanner.nextLine();
		   Plan plan =   GetPlan.getPlan(plantype);
		   plan.setRate();
		   plan.calculateBill(10);
		   System.out.println();
	}
}
