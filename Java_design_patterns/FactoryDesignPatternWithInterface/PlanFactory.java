package FactoryDesignPatternWithInterface;

public class PlanFactory {

	public Plan getPlanInstance(String planName) {
		if (planName.equalsIgnoreCase("commercialplan")) {
			return new CommercialPlan();
		} else if (planName.equalsIgnoreCase("domesticplan")) {
			return new DomesticPlan();
		}
		return null;
	}
}
