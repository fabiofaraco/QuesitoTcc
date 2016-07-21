package dao;

import bean.Usuario;

public interface UsuarioHibernateDao extends Dao<Usuario> {
	public Usuario realizaLogin(String email, String senha);
}
