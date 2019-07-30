package ObjectPool_Design-Pattern;

public class ObjectPoolExecutor {

	public static void main(String[] args) {
		Pool<MyClass> objPool = new MyClassPool();
		MyClass objMyClass = objPool.acquire();
		
		// perform actions with MyClass object
		while (objMyClass != null) {
			System.out.println(objMyClass.getname());
			objMyClass = objPool.acquire();
		}

	}

}
