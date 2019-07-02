package chainOfResponsibility;

public class NegativeProcessor implements Chain {

	private Chain nextInChain;

	@Override
	public void setNext(Chain c) {
		this.nextInChain = c;
	}

	@Override
	public void process(Nomber n) {
		if (n.getNo() < 0) {
			System.out.println("Negative number processing should go here...");
		} else {
			nextInChain.process(n);
		}

	}

}
