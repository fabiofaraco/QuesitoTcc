package dao;

import java.util.List;

import bean.Quesito;

public class QuesitoDao extends GenericoDao {
	
	@SuppressWarnings("unchecked")
	public List<Quesito> getListaQuesitos() {
		return (List<Quesito>)(Object)this.getLista("select q from Quesito q");
	}	

//	------------------------------------------------------------------------------------------------------
	
	public Quesito buscarQuesito(int id) {
		return (Quesito) buscar(id, Quesito.class);
	}
}
