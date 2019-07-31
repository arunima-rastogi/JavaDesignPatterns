package Bridgedesignpattern;

public abstract class Abstract {
	protected Implementation obj;
	
	public Abstract(Implementation o) {
		this.obj = o;
	}
	abstract void function1();
	abstract void function2();
	abstract void function3();
}
