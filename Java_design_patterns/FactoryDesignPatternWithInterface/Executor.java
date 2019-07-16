package FactoryDesignPatternWithInterface;

public class Executor {

	public static void main(String[] args) {
		
		PlanFactory obj = new PlanFactory();
		
		Plan objPlan = obj.getPlanInstance("DomesticPlan");
		
		objPlan.calculateBill(10);

	}

}
