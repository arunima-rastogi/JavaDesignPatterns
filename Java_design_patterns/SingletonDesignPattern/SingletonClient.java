package SingletonDesignPattern;

public class SingletonClient {
	
	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		
		System.out.println(obj);
	}

}
