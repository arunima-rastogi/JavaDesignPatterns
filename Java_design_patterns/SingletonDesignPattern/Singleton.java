package SingletonDesignPattern;

public class Singleton {
	
	private Singleton() {}
	
	private static Singleton obj;
	
	public static synchronized Singleton getInstance() {
		if(obj == null) {
			return new Singleton();
		}
		
		return obj;
	}

}
