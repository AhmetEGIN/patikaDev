package patikaDev.genericsInterface;

public interface IDatabase<T> {

	void add(T data);
	void delete(T data);
	void update(T data);
	T getDataById(int id);
}
