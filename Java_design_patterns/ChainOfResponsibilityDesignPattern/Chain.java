package ChainOfResponsibilityDesignPattern;

public interface Chain {
	public void setNext(Chain c);
	public void process(Nomber n);
}
