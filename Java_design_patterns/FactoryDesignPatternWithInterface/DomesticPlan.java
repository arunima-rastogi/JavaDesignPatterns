package FactoryDesignPatternWithInterface;

public class DomesticPlan implements Plan {

	private double rate=99;
	
	
	public double getRate() {
		return rate;
	}

	@Override
	public void calculateBill(int units) {
		System.out.println(units*rate);
		
	}

}
