package Bridgedesignpattern;

public class Client {
	public static void main(String[] args) {
		Abstract obj = new RefineAbstract(new ConcreteImplementation1());
		obj.function1();
	}
}
