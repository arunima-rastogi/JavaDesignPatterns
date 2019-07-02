package chainOfResponsibility;

public class PositiveProcessor implements Chain {

	private Chain nextInChain;

	@Override
	public void setNext(Chain c) {
		this.nextInChain = c;
	}

	@Override
	public void process(Nomber n) {
		if(n.getNo()>0){
			System.out.println("Positive numbers are processed here");
		}else{
			nextInChain.process(n);
		}
	}

}
