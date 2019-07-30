package ObjectPool_Design-Pattern;

import java.util.ArrayList;
import java.util.List;

public class MyClassPool implements Pool<MyClass>{

	private List<MyClass> my;
	
	public MyClassPool() {
		this.my = new ArrayList<>();
		this.my.add(new MyClass("Jackychan"));
	}
	
	@Override
	public MyClass acquire() {
		if(this.my.size()>0) {
			return my.remove(0);
		}else {
			return null;
		}
	}

	@Override
	public void release(MyClass t) {
		this.my.add(t);
		
	}
	
	

}
