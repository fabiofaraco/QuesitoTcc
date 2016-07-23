package interfaces;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> {
	void incluir(T t);
	void alterar(T t);
	void remover(Serializable id);
	List<T> getLista(String q);
	T buscar(Serializable id);
}
