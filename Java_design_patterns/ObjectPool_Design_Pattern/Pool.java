package ObjectPool_Design_Pattern;

public interface Pool<T> {

	public T acquire();
	public void release(T t);
}
