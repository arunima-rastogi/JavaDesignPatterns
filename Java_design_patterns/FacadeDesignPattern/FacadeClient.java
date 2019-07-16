package FacadeDesignPattern;

public class FacadeClient {

	public static void main(String[] args) {
		ShapeFacade obj = new ShapeFacade();

		obj.drawCircle();
		obj.drawRectangle();
		obj.drawSquare();

	}

}
