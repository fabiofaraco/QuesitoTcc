package dao;

import java.util.List;

import bean.Requerente;

public class RequerenteDao extends GenericoDao {

	@SuppressWarnings("unchecked")
	public List<Requerente> getListaRequerentes() {
		return (List<Requerente>)(Object)this.getLista("select r from Requerente r");
	}	

//	------------------------------------------------------------------------------------------------------
	
	public Requerente buscarRequerente(int id) {
		return (Requerente) buscar(id, Requerente.class);
	}
}
