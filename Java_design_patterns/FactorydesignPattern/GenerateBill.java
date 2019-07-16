package FactorydesignPattern;

import java.io.*;

class GenerateBill {
	public static void main(String args[]) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();


		String planName = "DOMESTICPLAN";
		int units = 99;

		Plan p = planFactory.getPlan(planName);
		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);
	}
}