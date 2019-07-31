package Bridgedesignpattern;

public class RefineAbstract extends Abstract {

	public RefineAbstract(Implementation o) {
		super(o);
	}

	@Override
	void function1() {
		System.out.println("Function 1 called");
		obj.function1();

	}

	@Override
	void function2() {
		System.out.println("Function 2 called");

	}

	@Override
	void function3() {
		System.out.println("Function 3 called");

	}

}
