package mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import bean.Menu;

@ManagedBean
public class MenuBean {
	private final String ALT_USUARIO = "Usuários";
	private final String HREF_USUARIO = "lista-usuario?faces-redirect=true";
	private final String NOME_USUARIO = "Usuário";
	private final String NOME_IMG_USUARIO = "usuario.png";
	
	private final String ALT_REQUERENTE = "Requerentes";
	private final String HREF_REQUERENTE = "lista-requerente?faces-redirect=true";
	private final String NOME_REQUERENTE = "Requerente";
	private final String NOME_IMG_REQUERENTE = "requerente.png";
	
	private final String ALT_EVENTO = "Eventos";
	private final String HREF_EVENTO = "lista-evento?faces-redirect=true";
	private final String NOME_EVENTO = "Evento";
	private final String NOME_IMG_EVENTO = "evento.png";
	
	private final String ALT_PROTOCOLO = "Protocolos";
	private final String HREF_PROTOCOLO = "lista-protocolo?faces-redirect=true";
	private final String NOME_PROTOCOLO = "Protocolo";
	private final String NOME_IMG_PROTOCOLO = "protocolo.png";
	
	public ArrayList<Menu> getMenus() {
		ArrayList<Menu> menus = new ArrayList<>();
		
		Menu menuUsuario = new Menu();
		menuUsuario.setAlt(ALT_USUARIO);
		menuUsuario.setHref(HREF_USUARIO);
		menuUsuario.setNome(NOME_USUARIO);
		menuUsuario.setNomeImg(NOME_IMG_USUARIO);
		menus.add(menuUsuario);
		
		Menu menuRequerente = new Menu();
		menuRequerente.setAlt(ALT_REQUERENTE);
		menuRequerente.setHref(HREF_REQUERENTE);
		menuRequerente.setNome(NOME_REQUERENTE);
		menuRequerente.setNomeImg(NOME_IMG_REQUERENTE);
		menus.add(menuRequerente);
		
		Menu menuEvento = new Menu();
		menuEvento.setAlt(ALT_EVENTO);
		menuEvento.setHref(HREF_EVENTO);
		menuEvento.setNome(NOME_EVENTO);
		menuEvento.setNomeImg(NOME_IMG_EVENTO);
		menus.add(menuEvento);
		
		Menu menuProtocolo = new Menu();
		menuProtocolo.setAlt(ALT_PROTOCOLO);
		menuProtocolo.setHref(HREF_PROTOCOLO);
		menuProtocolo.setNome(NOME_PROTOCOLO);
		menuProtocolo.setNomeImg(NOME_IMG_PROTOCOLO);
		menus.add(menuProtocolo);
		
		return menus;
	}
}
