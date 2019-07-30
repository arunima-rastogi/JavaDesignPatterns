package ObjectPool_Design-Pattern;

public interface Pool<T> {

	public T acquire();
	public void release(T t);
}
