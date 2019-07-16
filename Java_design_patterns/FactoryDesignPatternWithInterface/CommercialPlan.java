package FactoryDesignPatternWithInterface;

public class CommercialPlan implements Plan {

	private double rate = 100;

	public double getRate() {
		return rate;
	}

	@Override
	public void calculateBill(int units) {
		System.out.println(units * rate);

	}

}
