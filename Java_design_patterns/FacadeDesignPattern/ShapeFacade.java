package FacadeDesignPattern;

public class ShapeFacade {

	private Rectangle rec;
	private Square sq;
	private Circle cir;

	public ShapeFacade() {
		rec = new Rectangle();
		sq = new Square();
		cir = new Circle();
	}

	public void drawCircle() {
		cir.draw();
	}

	public void drawSquare() {
		sq.draw();
	}

	public void drawRectangle() {
		rec.draw();
	}
}
